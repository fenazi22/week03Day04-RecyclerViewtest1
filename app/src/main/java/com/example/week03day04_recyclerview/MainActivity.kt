package com.example.week03day04_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var recyclerview:RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connectViews()
        prepareReclerView()
    }
    private fun connectViews(){recyclerview = findViewById(R.id.recyclerview)}
    private fun prepareReclerView(){
        var array:ArrayList<Person> = ArrayList()
        array.add(Person("Faisa", R.drawable.profile))
        array.add(Person("Ali", R.drawable.profile))
        array.add(Person("Fahad",R.drawable.profile))
        array.add(Person("Mazen",R.drawable.profile))
    }
}