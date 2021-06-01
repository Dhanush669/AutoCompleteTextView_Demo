package com.devgd.autocompletetextviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    ArrayList<String> personNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personNames=new ArrayList<>();
        autoCompleteTextView=findViewById(R.id.autocompleteTextView);
        personNames.add("Abdul Kalam IND");
        personNames.add("Alastair Cook ENG");
        personNames.add("Aaron Finch AUS");
        personNames.add("Ajinkya Rahane IND");
        personNames.add("Axar Patel IND");
        personNames.add("MS Dhoni IND");
        personNames.add("AB de Villiers SA");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,personNames);
        autoCompleteTextView.setAdapter(adapter);

    }
}