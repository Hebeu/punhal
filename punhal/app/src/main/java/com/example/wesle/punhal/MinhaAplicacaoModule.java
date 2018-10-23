package com.example.wesle.punhal;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class MinhaAplicacaoModule{
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}
