package com.example.wesle.punhal;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class MinhaAplicacao extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerMinhaAplicacaoComponente.create().inject(this);
    }
    //Valor retornado para o Injetor da main activity
    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
//    @Inject
//    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;

}
