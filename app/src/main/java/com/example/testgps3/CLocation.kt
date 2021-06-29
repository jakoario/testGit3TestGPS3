package com.example.testgps3

import android.location.Location

class CLocation : Location {

    constructor(location: Location): super(location)



    override fun distanceTo(dest: Location?): Float {

        return super.distanceTo(dest)
    }


    override fun getSpeed(): Float {

        return super.getSpeed() * 3.6F
    }

}