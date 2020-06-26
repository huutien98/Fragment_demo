package com.vncoder.fragment_demo.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.vncoder.fragment_demo.R
import kotlinx.android.synthetic.main.fragment_2.view.*

class Fragment_2 : Fragment() {

    var inputText: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         val root = inflater.inflate(R.layout.fragment_2,container,false)


            inputText = arguments?.getString("input")
            var  tv_fragment2 = root.findViewById<View>(R.id.fragment_tv2) as TextView
            tv_fragment2.setText(inputText)
        return root
    }


}