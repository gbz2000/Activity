package com.example.gbz.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnStartAty1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("OnCreate");

        btnStartAty1 = (Button)findViewById(R.id.button);
        btnStartAty1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, Aty1.class);
                i.putExtra("txt","Hello Aty1");

                startActivity(i);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        System.out.println("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        System.out.println("onRestart");
    }
}
