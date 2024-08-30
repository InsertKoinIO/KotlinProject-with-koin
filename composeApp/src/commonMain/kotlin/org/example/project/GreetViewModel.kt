package org.example.project

import androidx.lifecycle.ViewModel

class GreetViewModel(private val greeting: Greeting) : ViewModel() {

    init {
        println("GreetViewModel created - $this")
    }

    fun greet() = greeting.greet()
}