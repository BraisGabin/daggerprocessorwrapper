package com.braisgabin.dagger.moduleb;

import com.braisgabin.dagger.modulec.ComponentC;
import dagger.Component;

@Component(dependencies = ComponentC.class)
public interface ComponentB {

    @Component.Builder
    interface Builder {

        Builder with(ComponentC component);

        ComponentB build();
    }

    String key();
}
