package com.example.landmarkdenemesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.landmarkdenemesi.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        landmarkArrayList=new ArrayList<>();
        Landmark lenovo=new Landmark("Legion 5","Lenovo",R.drawable.legion);
        Landmark acer=new Landmark("Nitro 5","Acer",R.drawable.nitro);
        Landmark monster=new Landmark("Abra","Monster",R.drawable.abra);
        landmarkArrayList.add(lenovo);
        landmarkArrayList.add(acer);
        landmarkArrayList.add(monster);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);
    }
}