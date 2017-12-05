package com.example.t520.myapptest2;

import android.app.Activity;

import dagger.Component;

/**
 * Created by omi on 5/12/2017.
 */

@ActivityScope
@Component(dependencies = StringComponent.class, modules= ModuleExample.class)
public interface DemoAppComponent {
    void inject(Activity activity);
}
