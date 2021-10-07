package com.example.selectionwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //    Membuat data list chart kpop
    String[] top_chart = {"Enhypen", "Twice", "ITZY", "Stayc", "Astro", "WannaOne", "Aespa", "BTS"};
    //    Membuat komponen list view
    ListView listView;

    //    Membuat data Member
    String[] data_member = {"Jake", "Heeseung", "Jungwon", "Jay", "Sunghoon"};
    //    Membuat komponen spinner
    Spinner spinner;

    //    Membuat data Weekly Chart
    String[] weekly_chart = {"Blackpink", "EXO", "NCT", "Kang Saebyeok"};
    //  Membuat komponen autocomplete
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // List View
        listView = findViewById(R.id.list_top_chart);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, top_chart);

        // Spinner
        spinner = findViewById(R.id.spinner_data_member);
        ArrayAdapter adapterSpinner = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, data_member);

        // AutocompletetextView
        autoCompleteTextView = findViewById(R.id.autoComplete_weekly_chart);
        ArrayAdapter adapterAutoComplete = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, weekly_chart);

        // set adapter list view
        listView.setAdapter(adapter);
        // set adapter spinnner
        spinner.setAdapter(adapterSpinner);
        // set AutoComplete
        autoCompleteTextView.setAdapter(adapterAutoComplete);

        // menambahkan event click pada list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Kamu menekan data: " + adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }
        });
        // menambah event selected pada spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Kamu memilih: " + adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        // menambah event click pada auto complete text view
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Artis ini: " + adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}