package com.example.testgps3

import android.location.Location

class CLocation : Location {

    constructor(location: Location): this(location, true)
    constructor(location: Location, bUseMetricUnits: Boolean): super(location)

    private var bUseMetricUnits: Boolean = false

    fun getUseMetricUnits (): Boolean {
        return this.bUseMetricUnits
    }

    fun setUseMetricUnits(bUseMetricUnits: Boolean) {
        this.bUseMetricUnits = bUseMetricUnits
    }

    override fun distanceTo(dest: Location?): Float {
        var nDistance: Float = super.distanceTo(dest)

        if (!this.getUseMetricUnits()) {
            // Convert meters to feet
            nDistance *= 3.28F
        }
        return nDistance
    }

    override fun getAltitude(): Double {
        var nAltitude: Double = super.getAltitude()

        if (!this.getUseMetricUnits()) {
            // Convert meters to feet
            nAltitude *= 3.28
        }
        return nAltitude
    }


    override fun getSpeed(): Float {
        var nSpeed: Float = super.getSpeed() * 3.6F

        if (!this.getUseMetricUnits()) {
            // Convert meters to feet
            nSpeed = super.getSpeed() * 2.23F
        }
        return nSpeed
    }

    override fun getAccuracy(): Float {
        var nAccuracy: Float = super.getAccuracy()

        if (!this.getUseMetricUnits()) {
            // Convert meters to feet
            nAccuracy *= 3.28F
        }
        return nAccuracy
    }
}