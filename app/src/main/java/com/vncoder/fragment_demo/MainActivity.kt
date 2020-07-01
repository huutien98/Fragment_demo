package com.vncoder.fragment_demo

import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.vncoder.fragment_demo.BroadcastReceiver.ExampleBroadcastReceiver
import com.vncoder.fragment_demo.Fragment.Fragment_2
import com.vncoder.fragment_demo.Fragment.Fragment_3
import com.vncoder.fragment_demo.Fragment.Fragment_4
import com.vncoder.fragment_demo.Item.ItemObject
import com.vncoder.fragment_demo.PassData.Comunicator_interface
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),
    Comunicator_interface {
    var exampleBroadcastReceiver = ExampleBroadcastReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun passActivity(title: String) {
        val bundle = Bundle()
        bundle.putString("title",title)
        tv_fragment.setText(title)
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

    override fun passDataImage(image: Int) {
        val bundle1 = Bundle()
        bundle1.putInt("01",image)

        val transaction1 = this.supportFragmentManager.beginTransaction()
        val fragment3 = Fragment_3()
        fragment3.arguments = bundle1
        transaction1.replace(R.id.rightPanel,fragment3)
        transaction1.addToBackStack(null)
        transaction1.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction1.commit()
    }

    override fun passDataList(list: ArrayList<ItemObject>?) {
        val bundle2 = Bundle()
        bundle2.putSerializable("list",list)

        val transaction2 = this.supportFragmentManager.beginTransaction()
        val fragment4 = Fragment_4()
        fragment4.arguments = bundle2
        transaction2.replace(R.id.rightPanel,fragment4)
        transaction2.addToBackStack(null)
        transaction2.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction2.commit()
    }
    override fun onStart() {
        super.onStart()
        val filter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        registerReceiver(exampleBroadcastReceiver, filter)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(exampleBroadcastReceiver)
    }

}