package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mBTNmenu1, mBTNmenu2, mBTNmenu3;
    private TextView mTVMenu1, mTVMenu2, mTVMenu3;
    private MenuViewModel mMenuViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBTNmenu1=findViewById(R.id.BTN_Menu1);
        mBTNmenu2=findViewById(R.id.BTN_Menu2);
        mBTNmenu3=findViewById(R.id.BTN_Menu3);

        mTVMenu1=findViewById(R.id.TV_menu1);
        mTVMenu2=findViewById(R.id.TV_menu2);
        mTVMenu3=findViewById(R.id.TV_menu3);

        //Inicialitzem la clase de Model View
        mMenuViewModel = new ViewModelProvider(this).get(MenuViewModel.class);

        mBTNmenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("menu", "MENU 1");

                //Fem un set del VM
                mMenuViewModel.setMenuseleccionado(mTVMenu1.getText().toString());


                startActivity(intent);
            }

        });
        mBTNmenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("menu", "MENU 2");

                //Fem un set del VM
                mMenuViewModel.setMenuseleccionado(mTVMenu2.getText().toString());

                startActivity(intent);
            }
        });
        mBTNmenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("menu", "MENU 3");

                //Fem un set del VM
                mMenuViewModel.setMenuseleccionado(mTVMenu3.getText().toString());

                startActivity(intent);
            }
        });
    }
}