package com.example.wesle.punhal;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class PerfilHotelFragmentModule {
    @ContributesAndroidInjector
    abstract PerfilHotelFragment contributePerfilHotelFragmentInjector();
}
