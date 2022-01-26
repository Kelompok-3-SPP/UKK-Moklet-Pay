package com.android.example.mokletpay.admin;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class ListPetugasAdapter extends RecyclerView.Adapter<ListPetugasAdapter.ListViewHolder>{
    private ArrayList<Petugas> listPetugas;
    private OnItemClickCallback onItemClickCallback;



    public ListPetugasAdapter(ArrayList<Petugas> list) {
        this.listPetugas= list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.container_data_petugas, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Petugas petugas= listPetugas.get(position);
        holder.tvNamaPetugas.setText(petugas.getNamaPetugas());
        holder.tvHari.setText(petugas.getHari());

    }

    @Override
    public int getItemCount() {
        return listPetugas.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaPetugas, tvHari;

        ListViewHolder(View itemView) {
            super(itemView);
            tvNamaPetugas = itemView.findViewById(R.id.tv_nama);
            tvHari = itemView.findViewById(R.id.tv_hari);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Petugas data);
    }

}
