package com.example.wesle.punhal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class PerfilHotelFragment extends Fragment {
    @Inject
    Hotel hotel;

    TextView nomeTextView;
    TextView estrelasTextView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.perfil_hotel_fragment,container,false);
//        nomeTextView = layout.findViewById(R.id.nome_hotel);
//        estrelasTextView = layout.findViewById(R.id.estrelas);
//        String h= hotel.getNome();
//        nomeTextView.setText(Hotel_Factory.provideInstance().getNome());
        return layout;
    }

    @Override
    public void onAttach(Context context) {
        AndroidInjection.inject((Activity) context);
        super.onAttach(context);
    }
}
