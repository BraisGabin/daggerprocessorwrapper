package com.braisgabin.dagger.moduleb

import com.braisgabin.dagger.modulec.ComponentC
import dagger.Component

@Component(dependencies = [ComponentC::class])
interface ComponentB {

    @Component.Builder
    interface Builder {

        fun with(component: ComponentC): Builder

        fun build(): ComponentB
    }

    fun key(): String
}
