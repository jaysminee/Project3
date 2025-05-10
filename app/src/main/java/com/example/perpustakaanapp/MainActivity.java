package com.example.perpustakaanapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private TabAdapter tabAdapter;
    private TextView judulHalaman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi komponen
        judulHalaman = findViewById(R.id.judulHalaman); // ID TextView di activity_main.xml
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        // Set adapter ViewPager
        tabAdapter = new TabAdapter(this);
        viewPager.setAdapter(tabAdapter);

        // Sinkronisasi TabLayout dengan ViewPager2
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    if (position == 0) tab.setText("Home");
                    else tab.setText("Akun Saya");
                }).attach();

        // Set teks awal
        judulHalaman.setText("Digital Library App");

    }
}
