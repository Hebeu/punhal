package com.example.wesle.punhal;

import android.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = PerfilHotelFragmentSubComponent.class)
public abstract class PerfilHotelFragmentModule {
//    @Binds
//    @IntoMap
//    @FragmentKey(PerfilHotelFragment.class)
//    abstract AndroidInjector.Factory<? extends Fragment>
//     bindYourFragmentInjectorFactory(PerfilHotelFragmentSubComponent.Builder builder);
}
