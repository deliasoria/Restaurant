package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button mBTNVolver, mBTNCancelar, mBTNConfirmar;
    private TextView mTVMenuReservado;

 private FrameLayout mFLMenuSeleccionat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mBTNVolver=findViewById(R.id.BTN_Volver);
        mBTNCancelar=findViewById(R.id.BTN_Cancelar);
        mBTNConfirmar=findViewById(R.id.BTN_Confirmar);
        mTVMenuReservado=findViewById(R.id.TV_MenuReservado);

        String numMenu = getIntent().getStringExtra("menu");
        mTVMenuReservado.setText(numMenu + " RESERVADO ");


        String numeromenu = getIntent().getStringExtra("menu");
        mBTNVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity2.this, MainActivity.class);

                startActivity(intent);
            }
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.FL_InformacionReserva, new MostrarMenuSeleccionat()).commit();


        //Al utilizar el boton de cancelar hacemos que pase a la pagina final de la aplicación con el siguiente metodo
        mBTNCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}