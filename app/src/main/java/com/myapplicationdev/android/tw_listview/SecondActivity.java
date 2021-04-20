package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> alYear1;
    ArrayList<Module> alYear2;
    ArrayList<Module> alYear3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        alYear1 = new ArrayList<Module>();
        alYear2 = new ArrayList<Module>();
        alYear3 = new ArrayList<Module>();

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        alYear2.add(new Module("C208","Computer"));
        alYear2.add(new Module("C200","Tree"));
        alYear2.add(new Module("C346","Computer"));

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);



    }



}
