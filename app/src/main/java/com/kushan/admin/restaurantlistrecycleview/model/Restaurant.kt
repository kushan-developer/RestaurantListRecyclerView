package com.kushan.admin.restaurantlistrecycleview.model

class Restaurant

{
     var name = ""
     var speciality = ""
     var address=""
     var rating= 0
     var image = ""

    constructor(name: String, speciality: String, address: String, rating: Int, image: String) {
        this.name = name
        this.speciality = speciality
        this.address = address
        this.rating = rating
        this.image = image
    }
}