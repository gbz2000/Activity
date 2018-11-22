package com.example.gbz.androidapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class Aty1 extends Activity {

    private Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aty1);

        btnClose = (Button)findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
