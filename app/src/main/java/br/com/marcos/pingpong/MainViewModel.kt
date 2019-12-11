package br.com.marcos.pingpong

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    var homeScore = MutableLiveData<Int>()
    var awayScore = MutableLiveData<Int>()

    fun goalHome(){
        homeScore.value = homeScore.value?.plus(1)
    }

    fun goalAway(){
        awayScore.value = awayScore.value?.plus(1)
    }
}