package com.nansty.opendata.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.nansty.opendata.R;
import com.nansty.opendata.model.beans.Fields;


public class DetailActivity extends AppCompatActivity {

    public final static String FIELDS_KEY = "FIELDS_KEY";

    //Composants graphiques
    private TextView tv_titre, tv_detail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tv_titre = (TextView) findViewById(R.id.tv_titre);
        tv_detail = (TextView) findViewById(R.id.tv_detail);

        //Données
        Fields fields = (Fields) getIntent().getExtras().getSerializable(FIELDS_KEY);

        tv_titre.setText(fields.getNomDeLaManifestation());
        tv_detail.setText(fields.getDescriptifLong());

    }
}
