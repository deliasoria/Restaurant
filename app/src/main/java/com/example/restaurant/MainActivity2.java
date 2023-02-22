package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.ref.Reference;

public class MainActivity2 extends AppCompatActivity {

    private Button mBTNVolver, mBTNCancelar, mBTNConfirmar;
    private TextView mTVMenuReservado;
    private CheckBox mCBMeGusta;
    private FirebaseDatabase mDatabase;
    private DatabaseReference mReference;

 private FrameLayout mFLMenuSeleccionat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mBTNVolver=findViewById(R.id.BTN_Volver);
        mBTNCancelar=findViewById(R.id.BTN_Cancelar);
        mBTNConfirmar=findViewById(R.id.BTN_Confirmar);
        mTVMenuReservado=findViewById(R.id.TV_MenuReservado);
        mCBMeGusta=findViewById(R.id.CB_Megusta);

        mDatabase=FirebaseDatabase.getInstance("https://menurestauranteceroca-default-rtdb.europe-west1.firebasedatabase.app/");
        mReference=mDatabase.getReference();

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


        //Listener del CheckBox
        mCBMeGusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.FL_Opinion, new FragmentDeOpinion()).commit();
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