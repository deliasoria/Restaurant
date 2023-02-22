package com.example.restaurant;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MenuViewModel extends ViewModel {

    private static final MutableLiveData<String> menuseleccionado = new MutableLiveData<>();

    //Declaramos el set del menu
    public void setMenuseleccionado(String menuVM){menuseleccionado.setValue(menuVM);}

    //Declaramos el get del model view para que devuelva la información
    public LiveData<String> getMenuseleccionado(){ return menuseleccionado;}

}
