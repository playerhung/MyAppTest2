package com.example.t520.myapptest2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by omi on 5/12/2017.
 */

@Singleton
@Component(modules={ModuleExample.class})
public interface StringComponent {
    String retrofit();
    String gson();
}
