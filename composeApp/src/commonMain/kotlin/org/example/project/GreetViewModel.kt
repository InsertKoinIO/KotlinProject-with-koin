package org.example.project

import androidx.lifecycle.ViewModel
import org.koin.mp.KoinPlatform
import org.koin.mp.KoinPlatformTools
import org.koin.mp.generateId

class GreetViewModel(private val greeting: Greeting) : ViewModel() {

    init {
        println("GreetViewModel created - $this")
    }

    fun greet() = greeting.greet()
    fun getId() = KoinPlatformTools.generateId()
}