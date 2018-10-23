package com.example.wesle.punhal;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface PerfilHotelFragmentSubComponent {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PerfilHotelFragment> {}
}
