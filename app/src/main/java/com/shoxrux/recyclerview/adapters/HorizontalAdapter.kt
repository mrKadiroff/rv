package com.shoxrux.recyclerview.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shoxrux.recyclerview.databinding.LayoutItem2Binding
import com.shoxrux.recyclerview.databinding.LayoutItemBinding
import com.shoxrux.recyclerview.models.CategoryData
import com.shoxrux.recyclerview.models.UserData

class HorizontalAdapter(var list: ArrayList<UserData>, var onItremClickListener: OnItremClickListener):RecyclerView.Adapter<HorizontalAdapter.Vh>() {



    inner class Vh(var layoutItemBinding: LayoutItem2Binding):RecyclerView.ViewHolder(layoutItemBinding.root){

        fun onBind(malumotlar: UserData) {
            layoutItemBinding.name.text = "${malumotlar.name} ${malumotlar.surname}"
            layoutItemBinding.rasm.setImageResource(malumotlar.image)
            //sdsd



            layoutItemBinding.root.setOnClickListener {
                onItremClickListener.onItemClick(malumotlar)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutItem2Binding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
       holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnItremClickListener{
        fun onItemClick(malumotlar: UserData)
    }

}