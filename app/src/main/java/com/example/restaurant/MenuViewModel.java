package com.example.restaurant;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MenuViewModel extends ViewModel {

    private static final MutableLiveData<String> menuseleccionado = new MutableLiveData<>();

    public void setMenuseleccionado(String menuVM){menuseleccionado.setValue(menuVM);}
    public LiveData<String> getMenuseleccionado(){ return menuseleccionado;}

}
