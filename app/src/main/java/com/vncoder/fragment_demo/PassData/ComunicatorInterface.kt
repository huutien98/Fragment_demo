package com.vncoder.fragment_demo.PassData

import com.vncoder.fragment_demo.Item.ItemObject


interface ComunicatorInterface {
    fun passData (data: String)
    fun passDataImage (image:Int)
    fun passDataList (list: ArrayList<ItemObject>?)

    fun passActivity (title: String)
}