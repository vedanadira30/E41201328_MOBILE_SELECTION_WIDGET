package com.example.kpopapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // inisialisasi recycle view, adapter, array list
    private RecyclerView recyclerView;
    private KpopAdapter kpopAdapter;
    private ArrayList<Kpop> kpopArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // memanggil method addData untuk menambahkan data pada list
        addData();
        // akses recycle view
        recyclerView = findViewById(R.id.recycle_view);
        // menggabungkan tampilan kpop item dengan main view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        // menambah list pada adapter
        kpopAdapter = new KpopAdapter(kpopArrayList);
        recyclerView.setAdapter(kpopAdapter);
    }
    // function untuk menambah data pada list
    private void addData() {
        kpopArrayList = new ArrayList<>();
        kpopArrayList.add(new Kpop("ITZY", "JYP", "21-12-2012", R.mipmap.kpop1));
        kpopArrayList.add(new Kpop("Aespa", "SM", "21-12-2012", R.mipmap.kpop2));
        kpopArrayList.add(new Kpop("Enhypen", "HYBE", "21-12-2012", R.mipmap.kpop3));
        kpopArrayList.add(new Kpop("RV", "BlockBerry", "21-12-2012", R.mipmap.kpop4));
    }
}