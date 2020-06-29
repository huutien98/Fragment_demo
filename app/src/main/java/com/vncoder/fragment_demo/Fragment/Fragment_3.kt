package com.vncoder.fragment_demo.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.vncoder.fragment_demo.R


class Fragment_3 : Fragment() {
    var Imageview: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_3,container,false)
        Imageview = arguments?.getInt("01").toString()
        var img_fragment3 = root.findViewById<View>(R.id.img_fragment3) as ImageView
        img_fragment3.setImageResource(Imageview!!.toInt())

        return root
    }


}