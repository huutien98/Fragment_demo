package com.vncoder.fragment_demo.PassData

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicatorViewModel : ViewModel() {
    val messenger = MutableLiveData<Any>()
    // any : không thể rỗng

    fun setMsgCommunicator(msg:String){
        messenger.setValue(msg)
    }
}