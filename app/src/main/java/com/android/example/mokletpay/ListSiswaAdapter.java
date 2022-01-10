package com.android.example.mokletpay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListSiswaAdapter extends RecyclerView.Adapter<ListSiswaAdapter.ListViewHolder>{
    private ArrayList<Siswa> listSiswaP;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListSiswaAdapter(ArrayList<Siswa> list){this.listSiswaP = list; }



    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.container_history_pembayaran, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        Siswa siswap = listSiswaP.get(position);
        holder.tv_nama.setText(siswap.getNamaP());
        holder.tv_nominal.setText(siswap.getNominalP());
        holder.tv_tanggal.setText(siswap.getTanggalP());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listSiswaP.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() { return listSiswaP.size();}

    static class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama, tv_nominal, tv_tanggal;

        ListViewHolder(View itemView) {
            super(itemView);
            tv_nama = itemView.findViewById(R.id.tv_nama_list_history);
            tv_nominal = itemView.findViewById(R.id.tv_nominal_list_history);
            tv_tanggal = itemView.findViewById(R.id.tv_tanggal_list_history);
        }
    }

       public interface OnItemClickCallback{
        void onItemClicked(Siswa data);
       }

}
