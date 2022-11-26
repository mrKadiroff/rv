package com.shoxrux.recyclerview.malumotlar

import com.shoxrux.recyclerview.R
import com.shoxrux.recyclerview.models.CategoryData
import com.shoxrux.recyclerview.models.UserData

object setData {

    fun UserData():Array<String>{

        val ismalar = arrayOf(
            "Shoxrux",
            "Bahodir",
            "Zafar",
            "Nodir"
        )

        return ismalar
    }


    fun getCustomObjects():ArrayList<UserData> {

        val customObjects = ArrayList<UserData>()

        customObjects.apply {
            add(com.shoxrux.recyclerview.models.UserData("Kenguru","Kadirov", R.drawable.car1,"Animals"))
            add(com.shoxrux.recyclerview.models.UserData("Lg","Sadriddonov", R.drawable.car2,"Phones"))
            add(com.shoxrux.recyclerview.models.UserData("Sher","Kadirov", R.drawable.car3,"Animals"))
            add(com.shoxrux.recyclerview.models.UserData("Lasetti","Nodirov", R.drawable.house,"Cars"))
            add(com.shoxrux.recyclerview.models.UserData("Iphone","Nodirov", R.drawable.house,"Phones"))
            add(com.shoxrux.recyclerview.models.UserData("Bmw","Nodirov", R.drawable.house,"Cars"))
        }


        return customObjects
    }


    fun getCustomObjects2():ArrayList<CategoryData> {

        val customObjects = ArrayList<CategoryData>()

        customObjects.apply {
            add(com.shoxrux.recyclerview.models.CategoryData("Cars"))
            add(com.shoxrux.recyclerview.models.CategoryData("Animals"))
            add(com.shoxrux.recyclerview.models.CategoryData("Phones"))

        }


        return customObjects
    }







}