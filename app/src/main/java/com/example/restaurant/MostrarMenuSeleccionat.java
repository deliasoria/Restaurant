package com.example.restaurant;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MostrarMenuSeleccionat extends Fragment {

    //Declaramos la clase de Model View
    private MenuViewModel mMenuModelView;

    // Declaramos la clase de Fragment
    private TextView mFragmentMenus;

    public MostrarMenuSeleccionat() {
        // Required empty public constructor

    }


    //Dejamos solo el metodo de OnCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Declarem el que hi havia al return amb una variable per a poder ficar accions enter mig
        View v = inflater.inflate(R.layout.fragment_mostrar_menu_seleccionat, container, false);

        //Instanciem el fragment
        mFragmentMenus = v.findViewById(R.id.TV_FragmentMenu);

        //Inicializamos el model view
        mMenuModelView = new ViewModelProvider(this).get(MenuViewModel.class);

        //Cogemos el get del VM para ponerlo en el fragment y que escriba el seleccionado en cada momento
        mMenuModelView.getMenuseleccionado().observe(getViewLifecycleOwner(), itemObservat -> {
            mFragmentMenus.setText(itemObservat);
        });

        //Ponemos en return la variable v.
        return v;
    }
}