package com.vncoder.fragment_demo

import com.vncoder.fragment_demo.Item.ItemObject


interface Comunicator_interface {
    fun passData (data: String)
    fun passDataImage (image:Int)
    fun passDataList (list: ArrayList<ItemObject>?)

    fun passActivity (title: String)
}