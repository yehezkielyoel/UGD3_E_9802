package com.smith.ugd3_y_xxxx;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.smith.ugd3_y_xxxx.databinding.ActivityMainBinding;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding adapterRecyclerViewBinding;
    private ArrayList<Mahasiswa> ListMahasiswa;
    private RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapterRecyclerViewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ListMahasiswa = new DaftarMahasiswa().MAHASISWA;

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(MainActivity.this,ListMahasiswa);

        adapterRecyclerViewBinding.recyclerViewMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        adapterRecyclerViewBinding.recyclerViewMahasiswa.setItemAnimator(new DefaultItemAnimator());
        adapterRecyclerViewBinding.recyclerViewMahasiswa.setAdapter(adapter);
    }



}