package com.vncoder.fragment_demo.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vncoder.fragment_demo.Adapter.AdapterItem
import com.vncoder.fragment_demo.Item.ItemObject
import com.vncoder.fragment_demo.R


class Fragment_4 : Fragment() {
    lateinit var listData: ArrayList<ItemObject>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         var root = inflater.inflate(R.layout.fragment_4,container,false)
        var listData = arguments?.getSerializable("list") as ArrayList<ItemObject>


        var recyclerView: RecyclerView = root.findViewById(R.id.rv_fragment4)
        val adapter = AdapterItem(listData)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter


//        var list_fragment4 = root.findViewById<View>(R.id.rv_fragment4) as TextView
//        if (listData != null) {
//            list_fragment4.setText(listData.size.toString())
//        }


        return root
    }


}