package com.example.t520.myapptest2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by omi on 5/12/2017.
 */

@Scope
@Documented
@Retention(value= RetentionPolicy.RUNTIME)
public @interface ActivityScope
{
}
