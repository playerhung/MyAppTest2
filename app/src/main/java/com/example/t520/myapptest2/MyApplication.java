package com.example.t520.myapptest2;

import android.app.Application;

import dagger.Module;

/**
 * Created by omi on 4/12/2017.
 */

public class MyApplication extends Application {
    private StringComponent stringComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        stringComponent = DaggerStringComponent.builder()
                // list of modules that are part of this component need to be created here too
                .moduleExample(new ModuleExample())
                .build();
    }
}
