package com.kushan.admin.restaurantlistrecycleview.adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.kushan.admin.restaurantlistrecycleview.R
import com.kushan.admin.restaurantlistrecycleview.databinding.RestaurantBinding
import com.kushan.admin.restaurantlistrecycleview.viewmodel.RestaurantViewModel

class CustomAdapter(private val context:Context,private val arrylist:ArrayList<RestaurantViewModel>):RecyclerView.Adapter<CustomAdapter.CustomView>()

{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomView {

        val layoutInflater = LayoutInflater.from(parent.context)

        val restaurantBinding:RestaurantBinding = DataBindingUtil.inflate(layoutInflater, R.layout.innerlayout,parent,false)

        return CustomView(restaurantBinding)

    }

    override fun getItemCount(): Int {


       return arrylist.size
    }

    override fun onBindViewHolder(holder: CustomView, position: Int) {

        val restaurantViewModel = arrylist[position]
        holder.bind(restaurantViewModel)



    }


    class CustomView(val restaurantBinding: RestaurantBinding):RecyclerView.ViewHolder(restaurantBinding.root)


    {
        fun bind (restaurantViewModel: RestaurantViewModel)
        {

            this.restaurantBinding.restaurantmodel = restaurantViewModel
            restaurantBinding.executePendingBindings()


        }






    }



}