package com.silverkeytech.android_rivers.creators

import java.util.ArrayList
import android.content.Context
import com.silverkeytech.android_rivers.R
import java.io.ByteArrayOutputStream
import com.silverkeytech.android_rivers.xml.AirportCodeParser

public fun getAirportCodes(context: Context) : ArrayList<AirportCode>{
    val xml = context.getAssets()!!.open("airports.xml")!!
    val builder =  AirportCodeBuilder()
    AirportCodeParser().parse(xml, builder)
    xml.close()

    return builder.build()
}

fun getStringFromAsset(context: Context, path : String): String{
    val xmlFile = context.getAssets()!!.open(path)!!
    val buffer = ByteArray(xmlFile.available())
    xmlFile.read(buffer)
    xmlFile.close()
    return String(buffer)
}