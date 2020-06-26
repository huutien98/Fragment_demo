package com.vncoder.fragment_demo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Communicator_viewModel : ViewModel() {
    val messenger = MutableLiveData<Any>()
    // any : không thể rỗng

    fun setMsgCommunicator(msg:String){
        messenger.setValue(msg)
    }
}