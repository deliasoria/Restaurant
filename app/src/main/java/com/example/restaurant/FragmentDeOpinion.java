package com.example.restaurant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentDeOpinion extends Fragment {
    //Declaramos la clase de Model View
    private MenuViewModel mMenuModelView;

    // Declaramos la clase de Fragment
    private TextView mFragmentOpinion;


    public FragmentDeOpinion() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_de_opinion, container, false);

        //Instanciem el fragment
        mFragmentOpinion = v.findViewById(R.id.TV_FragmentOpinion);

        //Inicializamos el model view
        mMenuModelView = new ViewModelProvider(this).get(MenuViewModel.class);

        //Cogemos el get del VM para ponerlo en el fragment y que escriba el seleccionado en cada momento
        mMenuModelView.getMenuseleccionado().observe(getViewLifecycleOwner(), itemObservat -> {
            mFragmentOpinion.setText(itemObservat);
        });


        return v;
    }
}