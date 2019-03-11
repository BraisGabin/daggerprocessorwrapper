package com.braisgabin.dagger.modulea

import com.braisgabin.dagger.moduleb.ComponentB
import dagger.Component

@Component(dependencies = [ComponentB::class])
interface ComponentA {

    @Component.Builder
    interface Builder {

        fun with(component: ComponentB): Builder

        fun build(): ComponentA
    }

    fun key(): String
}
