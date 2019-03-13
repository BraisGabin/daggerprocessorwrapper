package com.braisgabin.dagger.modulec;

import dagger.BindsInstance;
import dagger.Component;

@Component
public interface ComponentC {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder with(String key);

        ComponentC build();
    }

    String key();
}
