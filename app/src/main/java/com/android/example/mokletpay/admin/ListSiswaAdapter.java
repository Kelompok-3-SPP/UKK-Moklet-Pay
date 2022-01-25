package com.android.example.mokletpay.admin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class ListSiswaAdapter extends RecyclerView.Adapter<ListSiswaAdapter.ListViewHolder> {
    private ArrayList<com.android.example.mokletpay.admin.SiswaAdmin> listSiswa;


    public ListSiswaAdapter(ArrayList<com.android.example.mokletpay.admin.SiswaAdmin> list){this.listSiswa= list; }



    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.container_data_siswa, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        com.android.example.mokletpay.admin.SiswaAdmin siswa = listSiswa.get(position);
        holder.tv_nama_datasiswa.setText(siswa.getNamaSiswa());
        holder.tv_kelas_datasiswa.setText(siswa.getKelasSiswa());

    }

    @Override
    public int getItemCount() { return listSiswa.size();}

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama_datasiswa, tv_kelas_datasiswa;

        ListViewHolder(View itemView) {
            super(itemView);
            tv_nama_datasiswa = itemView.findViewById(R.id.tv_nama_datasiswa);
            tv_kelas_datasiswa = itemView.findViewById(R.id.tv_kelas_datasiswa);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(com.android.example.mokletpay.admin.SiswaAdmin data);
    }

}
