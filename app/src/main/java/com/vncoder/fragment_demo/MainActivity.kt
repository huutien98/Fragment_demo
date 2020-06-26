package com.vncoder.fragment_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.vncoder.fragment_demo.Fragment.Fragment_0
import com.vncoder.fragment_demo.Fragment.Fragment_2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),Comunicator_interface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun passData(data: String) {
        val bundle = Bundle()
        bundle.putString("input",data)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragment2 = Fragment_2()
        fragment2.arguments = bundle

        transaction.replace(R.id.rightPanel, fragment2)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()
    }


}