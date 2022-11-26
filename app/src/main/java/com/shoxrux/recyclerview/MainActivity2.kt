package com.shoxrux.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shoxrux.recyclerview.databinding.ActivityMain2Binding
import com.shoxrux.recyclerview.models.UserData

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val malumotlar = intent.getSerializableExtra("value") as UserData

        binding.rasm.setImageResource(malumotlar.image)
        binding.tv.text = malumotlar.name

    }
}