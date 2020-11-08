package com.kushan.admin.restaurantlistrecycleview

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.kushan.admin.restaurantlistrecycleview.adapter.CustomAdapter
import com.kushan.admin.restaurantlistrecycleview.viewmodel.RestaurantViewModel


class MainActivity : AppCompatActivity() {

    private var recycleview:RecyclerView?=null
    private var customadapter:CustomAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleview = findViewById(R.id.recyclerview) as RecyclerView

        var categoryViewModel: RestaurantViewModel = ViewModelProviders.of(this).get(RestaurantViewModel::class.java)

        categoryViewModel.getArrayList().observe(this, Observer {restaurantViewModels->


            customadapter = CustomAdapter(this@MainActivity,restaurantViewModels!!)
            recycleview!!.setLayoutManager(LinearLayoutManager(this@MainActivity))
            recycleview!!.setAdapter(customadapter)



        })




    }
}
