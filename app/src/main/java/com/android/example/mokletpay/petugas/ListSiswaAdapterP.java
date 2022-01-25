package com.android.example.mokletpay.petugas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class ListSiswaAdapterP extends RecyclerView.Adapter<ListSiswaAdapterP.ListViewHolder>{
    private ArrayList<SiswaP> listSiswaP;


    public ListSiswaAdapterP(ArrayList<SiswaP> list){this.listSiswaP = list; }



    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate( R.layout.container_history_pembayaran, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        SiswaP siswap = listSiswaP.get(position);
        holder.tv_nama.setText(siswap.getNamaP());
        holder.tv_nominal.setText(siswap.getNominalP());
        holder.tv_tanggal.setText(siswap.getTanggalP());


    }

    @Override
    public int getItemCount() { return listSiswaP.size();}

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama, tv_nominal, tv_tanggal;

        ListViewHolder(View itemView) {
            super(itemView);
            tv_nama = itemView.findViewById(R.id.tv_nama_list_history);
            tv_nominal = itemView.findViewById(R.id.tv_nominal_list_history);
            tv_tanggal = itemView.findViewById(R.id.tv_tanggal_list_history);
        }
    }

       public interface OnItemClickCallback{
        void onItemClicked(SiswaP data);
       }

}
