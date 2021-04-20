package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> alYear1;
    ArrayList<Module> alYear2;
    ArrayList<Module> alYear3;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        alYear1 = new ArrayList<Module>();
        alYear2 = new ArrayList<Module>();
        alYear3 = new ArrayList<Module>();

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        alYear1.add(new Module("C123",true));
        alYear1.add(new Module("C321",false));
        alYear1.add(new Module("C231",true));

        alYear2.add(new Module("C208",true));
        alYear2.add(new Module("C200",false));
        alYear2.add(new Module("C346",true));

        alYear3.add(new Module("C098",true));
        alYear3.add(new Module("C890",false));
        alYear3.add(new Module("C980",true));

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        if (year.equals("Year 1")){
            aa = new ModuleAdapter(this, R.layout.row, alYear1);
        } else if(year.equals("Year 2")){
            aa = new ModuleAdapter(this, R.layout.row, alYear2);
        } else{
            aa = new ModuleAdapter(this, R.layout.row, alYear3);
        }



        lv.setAdapter(aa);


    }



}
