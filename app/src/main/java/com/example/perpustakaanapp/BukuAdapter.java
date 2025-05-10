package com.example.perpustakaanapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.BukuViewHolder> {

    private Context context;
    private List<Buku> daftarBuku;

    public BukuAdapter(Context context, List<Buku> daftarBuku) {
        this.context = context;
        this.daftarBuku = daftarBuku;
    }

    @NonNull
    @Override
    public BukuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_buku, parent, false);
        return new BukuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BukuViewHolder holder, int position) {
        Buku buku = daftarBuku.get(position);

        holder.imageBuku.setImageResource(buku.getGambar());
        holder.judulBuku.setText(buku.getJudul());
        holder.penulisBuku.setText(buku.getPenulis());
        holder.genreBuku.setText(buku.getGenre());
        holder.tahunBuku.setText(buku.getTahun());
        holder.penerbitBuku.setText(buku.getPenerbit());

        holder.btnPinjam.setOnClickListener(v -> {
            Toast.makeText(context, "Meminjam: " + buku.getJudul(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return daftarBuku.size();
    }

    public static class BukuViewHolder extends RecyclerView.ViewHolder {
        ImageView imageBuku;
        TextView judulBuku, penulisBuku, genreBuku, tahunBuku, penerbitBuku;
        Button btnPinjam;

        public BukuViewHolder(@NonNull View itemView) {
            super(itemView);

            imageBuku = itemView.findViewById(R.id.imageBuku);
            judulBuku = itemView.findViewById(R.id.judulBuku);
            penulisBuku = itemView.findViewById(R.id.penulisBuku);
            genreBuku = itemView.findViewById(R.id.genreBuku);
            tahunBuku = itemView.findViewById(R.id.tahunBuku);
            penerbitBuku = itemView.findViewById(R.id.penerbitBuku);
            btnPinjam = itemView.findViewById(R.id.btnPinjam);
        }
    }
}
