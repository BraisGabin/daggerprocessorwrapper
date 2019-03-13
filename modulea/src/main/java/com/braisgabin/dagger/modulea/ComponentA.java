package com.braisgabin.dagger.modulea;


import com.braisgabin.dagger.moduleb.ComponentB;
import dagger.Component;

@Component(dependencies = ComponentB.class)
public interface ComponentA {

    @Component.Builder
    interface Builder {

        Builder with(ComponentB component);

        ComponentA build();
    }

    String key();
}
