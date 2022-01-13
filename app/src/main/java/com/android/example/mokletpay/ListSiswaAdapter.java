package com.android.example.mokletpay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;



public class ListSiswaAdapter extends RecyclerView.Adapter<ListSiswaAdapter.ListViewHolder> {
    private ArrayList<Siswa> listSiswa;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    public ListSiswaAdapter(ArrayList<Siswa> list) {
        this.listSiswa = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.container_history_siswa, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Siswa siswa = listSiswa.get(position);
        holder.tvBulan.setText(siswa.getBulan());
        holder.tvTanggal.setText(siswa.getTanggal());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listSiswa.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSiswa.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvBulan, tvTanggal;

        ListViewHolder(View itemView) {
            super(itemView);
            tvBulan = itemView.findViewById(R.id.tv_history_bulan);
            tvTanggal = itemView.findViewById(R.id.tv_history_tanggal);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Siswa data);
    }
}