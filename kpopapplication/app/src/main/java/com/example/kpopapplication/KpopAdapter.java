package com.example.kpopapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KpopAdapter extends RecyclerView.Adapter<KpopAdapter.KpopViewHolder> {

    // List untuk menampung data yang dikirim
    private ArrayList<Kpop> kpopArrayList;

    public KpopAdapter(ArrayList<Kpop> kpopArrayList) {
        this.kpopArrayList = kpopArrayList;
    }

    @NonNull
    @Override
    public KpopAdapter.KpopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // menempel layout adapter dengan template item
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.kpop, parent, false);
        return new KpopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KpopAdapter.KpopViewHolder holder, int position) {
        // menempel variable adapter dengan template item
        holder.txt_kpop_name.setText(kpopArrayList.get(position).getTxt_kpop_name());
        holder.txt_agency.setText(kpopArrayList.get(position).getTxt_agency());
        holder.txt_date_debut.setText(kpopArrayList.get(position).getTxt_date_debut());
        holder.profile_image.setImageResource(kpopArrayList.get(position).getProfile_image());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "This is kpop: " + kpopArrayList.get(position).getTxt_kpop_name(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        // melakukan perulangan pada item
        return (kpopArrayList != null) ? kpopArrayList.size() : 0;
    }

    public class KpopViewHolder extends RecyclerView.ViewHolder {
        // Variabel untuk menampung nilai yang dikirim dari model
        private TextView txt_kpop_name, txt_agency, txt_date_debut;
        private ImageView profile_image;

        public KpopViewHolder(@NonNull View itemView) {
            super(itemView);
            // set nilai yang dikirim dari model ke variable adapter
            txt_kpop_name = itemView.findViewById(R.id.txt_kpop_name);
            txt_agency = itemView.findViewById(R.id.txt_agency);
            txt_date_debut = itemView.findViewById(R.id.txt_date_debut);
            profile_image = itemView.findViewById(R.id.profile_image);
        }
    }
}