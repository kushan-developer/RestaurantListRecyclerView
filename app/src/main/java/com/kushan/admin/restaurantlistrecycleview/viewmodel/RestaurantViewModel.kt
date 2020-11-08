package com.kushan.admin.restaurantlistrecycleview.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.BindingAdapter
import android.widget.ImageView
import com.kushan.admin.restaurantlistrecycleview.R
import com.kushan.admin.restaurantlistrecycleview.model.Restaurant
import com.squareup.picasso.Picasso

class RestaurantViewModel : ViewModel

{
    var name = ""
    var speciality = ""
    var address=""
    var rating= 0
    var image = ""

    constructor() : super()
    constructor(restaurant: Restaurant) : super() {
        this.name = restaurant.name
        this.speciality = restaurant.speciality
        this.address = restaurant.address
        this.rating = restaurant.rating
        this.image = restaurant.image
    }


    var  arraylistmutablelivedata= MutableLiveData<ArrayList<RestaurantViewModel>>()

    var arraylist = ArrayList<RestaurantViewModel>()


    fun  getImageUrl():String{
        return image
    }


    fun getArrayList():MutableLiveData<ArrayList<RestaurantViewModel>>
    {

        val restaurant1 = Restaurant("Chinjabi","Chinese, Punjabi","Bavdhan, Pune-21",4, "https://cdn3.iconfinder.com/data/icons/placeholder-3/64/restaurant-placeholder-pin-pointer-gps-map-location-512.png")
        val restaurant2 = Restaurant("Masemari","Sea food","Bavdhan, Pune-21",3, "https://cdn3.iconfinder.com/data/icons/placeholder-3/64/restaurant-placeholder-pin-pointer-gps-map-location-512.png")
        val restaurant3 = Restaurant("Trikaya","Chinese","Bavdhan, Pune-21",4, "https://cdn3.iconfinder.com/data/icons/placeholder-3/64/restaurant-placeholder-pin-pointer-gps-map-location-512.png")
        val restaurant4 = Restaurant("Maratha Samrat","Maharashtrian","Kothrud, Pune",5, "https://cdn3.iconfinder.com/data/icons/placeholder-3/64/restaurant-placeholder-pin-pointer-gps-map-location-512.png")
        val restaurant5 = Restaurant("La Bali","Sea Food","Bavdhan, Pune-21",4, "https://cdn3.iconfinder.com/data/icons/placeholder-3/64/restaurant-placeholder-pin-pointer-gps-map-location-512.png")
        val restaurant6 = Restaurant("UpSouth","South Indian","Bavdhan, Pune-21",5, "https://cdn3.iconfinder.com/data/icons/placeholder-3/64/restaurant-placeholder-pin-pointer-gps-map-location-512.png")
        val restaurant7 = Restaurant("Malgudi Tiffins","South Indian","Kothrud, Pune",3, "https://cdn3.iconfinder.com/data/icons/placeholder-3/64/restaurant-placeholder-pin-pointer-gps-map-location-512.png")
        val restaurant8 = Restaurant("Mainland China","Chinese","Baner, Pune",3, "https://cdn3.iconfinder.com/data/icons/placeholder-3/64/restaurant-placeholder-pin-pointer-gps-map-location-512.png")
        val restaurant9 = Restaurant("The China Bowl","Chinese","Kothrud, Pune",2, "https://cdn3.iconfinder.com/data/icons/placeholder-3/64/restaurant-placeholder-pin-pointer-gps-map-location-512.png")
        val restaurant10 = Restaurant("Potoba","Maharashtrian","Karve Nagar, Pune",4, "https://cdn3.iconfinder.com/data/icons/placeholder-3/64/restaurant-placeholder-pin-pointer-gps-map-location-512.png")


        val  restaurantviewmodel1 : RestaurantViewModel = RestaurantViewModel(restaurant1)
        val  restaurantviewmodel2 : RestaurantViewModel = RestaurantViewModel(restaurant2)
        val  restaurantviewmodel3 : RestaurantViewModel = RestaurantViewModel(restaurant3)
        val  restaurantviewmodel4 : RestaurantViewModel = RestaurantViewModel(restaurant4)
        val  restaurantviewmodel5 : RestaurantViewModel = RestaurantViewModel(restaurant5)
        val  restaurantviewmodel6 : RestaurantViewModel = RestaurantViewModel(restaurant6)
        val  restaurantviewmodel7 : RestaurantViewModel = RestaurantViewModel(restaurant7)
        val  restaurantviewmodel8 : RestaurantViewModel = RestaurantViewModel(restaurant8)
        val  restaurantviewmodel9 : RestaurantViewModel = RestaurantViewModel(restaurant9)
        val  restaurantviewmodel10 : RestaurantViewModel = RestaurantViewModel(restaurant10)


        arraylist.add(restaurantviewmodel1)
        arraylist.add(restaurantviewmodel2)
        arraylist.add(restaurantviewmodel3)
        arraylist.add(restaurantviewmodel4)
        arraylist.add(restaurantviewmodel5)
        arraylist.add(restaurantviewmodel6)
        arraylist.add(restaurantviewmodel7)
        arraylist.add(restaurantviewmodel8)
        arraylist.add(restaurantviewmodel9)
        arraylist.add(restaurantviewmodel10)

        arraylistmutablelivedata.value = arraylist

        return arraylistmutablelivedata
    }





}


 object ImageBindingAdapter{


     @JvmStatic
     @BindingAdapter("android:src")

    fun setImageUrl(view:ImageView,url:String)
     {

         Picasso.with(view.context).load(url).placeholder(R.drawable.ic_launcher_background).into(view)

     }



 }






