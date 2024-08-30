package org.example.project

import org.koin.core.logger.Level
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.koinApplication
import org.koin.dsl.module

fun koinConfiguration() = koinApplication {
    printLogger(Level.DEBUG)
    modules(appModule)
}

val appModule = module {
    factoryOf(::Greeting)
    viewModelOf(::GreetViewModel)
}