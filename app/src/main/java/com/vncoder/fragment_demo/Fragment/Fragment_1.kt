package com.vncoder.fragment_demo.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.vncoder.fragment_demo.Communicator_viewModel
import com.vncoder.fragment_demo.R


class Fragment_1 : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_1,container,false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val txt = view?.findViewById<View>(R.id.tv_fragment1) as TextView
        val model = ViewModelProviders.of(activity!!).get(Communicator_viewModel::class.java)

        model.messenger.observe(this, object : Observer<Any> {
            override fun onChanged(t: Any?) {
                txt.text = t!!.toString()
            }
        });
        {

        }
    }


}   