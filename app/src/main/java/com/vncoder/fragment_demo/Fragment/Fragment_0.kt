package com.vncoder.fragment_demo.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProviders
import com.vncoder.fragment_demo.*


class Fragment_0 : Fragment() {

    lateinit var interf: Comunicator_interface

    companion object{
        lateinit var mctx:Context
    }

    private var model: Communicator_viewModel?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model = ViewModelProviders.of(activity!!).get(Communicator_viewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_0,container,false)
        interf = activity as Comunicator_interface


        var btn_fragment1 = root.findViewById<View>(R.id.btn_fragment1) as Button
        var btn_fragment2 = root.findViewById<View>(R.id.btn_fragment2) as Button
        var btn_fragment3 = root.findViewById<View>(R.id.btn_fragment3) as Button
        var btn_fragment4 = root.findViewById<View>(R.id.btn_fragment4) as Button
        var btn_fragment5 = root.findViewById<View>(R.id.btn_fragment5) as Button
        var btn_fragment6 = root.findViewById<View>(R.id.btn_fragment6) as Button

        btn_fragment1.setOnClickListener {
            var note : String
            note = "this is Fragment 1"
            model!!.setMsgCommunicator(note)
            var fragment_1 = Fragment_1()

            var fragment1 = fragmentManager?.beginTransaction()
            fragment1?.replace(
                R.id.rightPanel,
                Fragment_1()
            )
            fragment1?.commit()
        }



        btn_fragment2.setOnClickListener {
            var note = "this is fragment 2 by interface"
            interf.passData("input_txt")

            var fragment2 = fragmentManager?.beginTransaction()
            fragment2?.replace(
                R.id.rightPanel,
                Fragment_2()
            )
            fragment2?.commit()
        }



        btn_fragment3.setOnClickListener {
            var fragment3 = fragmentManager?.beginTransaction()
            fragment3?.replace(
                R.id.rightPanel,
                Fragment_3()
            )
            fragment3?.commit()
        }
        btn_fragment4.setOnClickListener {
            var fragment4 = fragmentManager?.beginTransaction()
            fragment4?.replace(
                R.id.rightPanel,
                Fragment_4()
            )
            fragment4?.commit()
        }
        btn_fragment5.setOnClickListener {
            var fragment5 = fragmentManager?.beginTransaction()
            fragment5?.replace(
                R.id.rightPanel,
                Fragment_5()
            )
            fragment5?.commit()
        }
        btn_fragment6.setOnClickListener {
            var fragment6 = fragmentManager?.beginTransaction()
            fragment6?.replace(
                R.id.rightPanel,
                Fragment_6()
            )
            fragment6?.commit()
        }

        return root

    }



}

