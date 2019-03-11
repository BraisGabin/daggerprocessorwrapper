package com.braisgabin.dagger.modulec

import dagger.BindsInstance
import dagger.Component

@Component
interface ComponentC {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun with(key: String): Builder

        fun build(): ComponentC
    }

    fun key(): String
}