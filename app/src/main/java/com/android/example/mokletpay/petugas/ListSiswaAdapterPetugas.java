package com.android.example.mokletpay.petugas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class ListSiswaAdapterPetugas extends RecyclerView.Adapter<ListSiswaAdapterPetugas.ListViewHolder>{
    private ArrayList<SiswaPetugas> listSiswaPetugas;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListSiswaAdapterPetugas(ArrayList<SiswaPetugas> list){this.listSiswaPetugas = list; }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.container_datasiswa_petugas, viewGroup, false);
        return new ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        SiswaPetugas siswapetugas = listSiswaPetugas.get(position);
        holder.tv_nama_datasiswa.setText(siswapetugas.getNamaPetugas());
        holder.tv_kelas_datasiswa.setText(siswapetugas.getKelasPetugas());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listSiswaPetugas.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() { return listSiswaPetugas.size();}

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama_datasiswa, tv_kelas_datasiswa;

        ListViewHolder(View itemView) {
            super(itemView);
            tv_nama_datasiswa = itemView.findViewById(R.id.tv_nama_datasiswa);
            tv_kelas_datasiswa = itemView.findViewById(R.id.tv_kelas_datasiswa);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(SiswaPetugas data);
    }
}
