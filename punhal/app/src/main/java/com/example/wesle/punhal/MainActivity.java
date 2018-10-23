package com.example.wesle.punhal;

import android.app.Activity;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.SupportMenuInflater;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasFragmentInjector {
    @Inject
    NetWorkApi networkApi;

    @Inject
    Hotel hotel;

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Override
    public AndroidInjector<Fragment> fragmentInjector() {
        return fragmentInjector;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        Hotel_Factory.newHotel();
        Hotel_Factory.provideInstance().setNome("Grande");
        String nooems = Hotel_Factory.provideInstance().getNome();
        hotel.setNome("GranHotel");
        hotel.setEstrelas(4);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().
                beginTransaction().
                replace(R.id.frameMain, new PerfilHotelFragment()).
                commit();
        boolean injected = networkApi != null;
//        TextView userAvailable = (TextView) findViewById(R.id.target);
//        userAvailable.setText("Dependency injection worked: " + String.valueOf(injected));
    }


}
