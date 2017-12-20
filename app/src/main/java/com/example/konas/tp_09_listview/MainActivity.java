package com.example.konas.tp_09_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
String[] Continents={"","Europe","Amerique"};
String[] Europe={"Macedoine","Grece","Italy"};
Intent intent = new Intent(this,Main2Activity.class);
String[] Amerique={"USA","Canada","Mexico","Bresil","Panama","Cuba"};
    HashMap<String, String[]> hashmap;
    ListView ListePays;
Spinner ListeCont;
TextView Texte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListeCont = findViewById(R.id.Cont);
        ListePays = findViewById(R.id.Pays);


        hashmap =
                new HashMap<String, String[]>();
        hashmap.put("Europe", Europe);
        hashmap.put("Amerique",Amerique);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
                Continents);
        ListeCont.setAdapter(adapter);


        ListeCont.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String Cont=adapterView.getSelectedItem().toString();
                afficherliste(Cont);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void afficherliste(final String Cont) {
        if (!(Cont.isEmpty())) {
            ArrayAdapter<String> adap = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, hashmap.get(Cont));
            ListePays.setAdapter(adap);
        } else
        ListePays.setAdapter(null);

        ListePays.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                intent.putExtra("pays",hashmap.get(Cont)[i]);
             //   startActivity(intent);
            }
        });
    }

}
