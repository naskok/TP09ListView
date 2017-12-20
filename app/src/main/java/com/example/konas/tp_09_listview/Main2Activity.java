package com.example.konas.tp_09_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView znPays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        znPays=findViewById(R.id.textView);
       // String Pays=intent.getStringExtra("pays");
        //znPays.setText(Pays);

    }
}
