package com.example.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBTNmenu1, mBTNmenu2, mBTNmenu3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBTNmenu1=findViewById(R.id.BTN_Menu1);
        mBTNmenu2=findViewById(R.id.BTN_Menu2);
        mBTNmenu3=findViewById(R.id.BTN_Menu3);

        mBTNmenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("menu", "MENU 1");
                startActivity(intent);
            }
        });
        mBTNmenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("menu", "MENU 2");
                startActivity(intent);
            }
        });
        mBTNmenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("menu", "MENU 3");
                startActivity(intent);
            }
        });
    }
}