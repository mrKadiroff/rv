package com.shoxrux.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shoxrux.recyclerview.adapters.RvAdapter
import com.shoxrux.recyclerview.databinding.ActivityMainBinding
import com.shoxrux.recyclerview.malumotlar.setData
import com.shoxrux.recyclerview.models.CategoryData
import com.shoxrux.recyclerview.models.UserData

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: RvAdapter
    private lateinit var tempArrayList: ArrayList<UserData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





        adapter = RvAdapter(setData.getCustomObjects2(), object : RvAdapter.OnItremClickListener {
            override fun onItemClick(malumotlar: CategoryData) {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("value", malumotlar)
                startActivity(intent)
            }

        })

        binding.rv.adapter = adapter



    }

}