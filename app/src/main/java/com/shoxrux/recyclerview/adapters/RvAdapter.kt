package com.shoxrux.recyclerview.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shoxrux.recyclerview.databinding.LayoutItemBinding
import com.shoxrux.recyclerview.malumotlar.setData
import com.shoxrux.recyclerview.models.CategoryData
import com.shoxrux.recyclerview.models.UserData

class RvAdapter(var list: ArrayList<CategoryData>, var onItremClickListener: OnItremClickListener):RecyclerView.Adapter<RvAdapter.Vh>() {
    lateinit var adapter: HorizontalAdapter
    lateinit var list2:ArrayList<UserData>


    inner class Vh(var layoutItemBinding: LayoutItemBinding):RecyclerView.ViewHolder(layoutItemBinding.root){

        fun onBind(malumotlar: CategoryData) {

            list2 = ArrayList()
            layoutItemBinding.categoriua.text = malumotlar.heading


            val UserData = setData.getCustomObjects()

            UserData.forEach {
                if (malumotlar.heading == it.category){
                    list2.add(it)
                }
            }

            adapter = HorizontalAdapter(list2,object :HorizontalAdapter.OnItremClickListener{
                override fun onItemClick(malumotlar: UserData) {

                }

            })

            layoutItemBinding.horizontaRv.adapter = adapter



            layoutItemBinding.root.setOnClickListener {
                onItremClickListener.onItemClick(malumotlar)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
       holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnItremClickListener{
        fun onItemClick(malumotlar: CategoryData)
    }

}