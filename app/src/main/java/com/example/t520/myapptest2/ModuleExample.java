package com.example.t520.myapptest2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by omi on 4/12/2017.
 */
@Module
public class ModuleExample {
    private static final String BASE_ENPOINT = "http://dummy.endpoint";

    @Provides
    @Singleton
    String getString() {
        return BASE_ENPOINT;
    }
}
