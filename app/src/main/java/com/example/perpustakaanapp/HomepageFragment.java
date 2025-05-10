package com.example.perpustakaanapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.perpustakaanapp.Buku;
import com.example.perpustakaanapp.BukuAdapter;
import com.example.perpustakaanapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomepageFragment extends Fragment {

    private RecyclerView recyclerViewBuku;
    private BukuAdapter bukuAdapter;
    private List<Buku> daftarBuku;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_homepage, container, false);

        recyclerViewBuku = view.findViewById(R.id.recyclerViewBuku);
        recyclerViewBuku.setLayoutManager(new LinearLayoutManager(getContext()));

        daftarBuku = new ArrayList();
        daftarBuku.add(new Buku(R.drawable.hujan, "Judul: Hujan", "Penulis: Tere Liye", "Genre: Fiksi", "Tahun: 2016", "Penerbit: Gramedia"));
        daftarBuku.add(new Buku(R.drawable.lautbercerita, "Judul: Laut Bercerita", "Penulis: Leila S. Chudori", "Genre: Drama", "Tahun: 2017", "Penerbit: KPG"));
        daftarBuku.add(new Buku(R.drawable.bulan, "Judul: Bulan", "Penulis: Tere Liye", "Genre: Fiksi", "Tahun: 2015", "Penerbit: Republika"));

        bukuAdapter = new BukuAdapter(getContext(), daftarBuku);
        recyclerViewBuku.setAdapter(bukuAdapter);

        return view;
    }
}
