package com.android.example.mokletpay.admin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.R;
import com.android.example.mokletpay.kelas.Kelas;

import java.util.ArrayList;

public class ListKelasAdapter extends RecyclerView.Adapter<ListKelasAdapter.ListViewHolder> {
    private ArrayList<Kelas> listKelas;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListKelasAdapter(ArrayList<Kelas> list) {
        this.listKelas = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.container_data_kelas, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Kelas kelas = listKelas.get(position);
        holder.tvKelas.setText(kelas.getKelas());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listKelas.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKelas.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvKelas;

        ListViewHolder(View itemView) {
            super(itemView);
            tvKelas = itemView.findViewById(R.id.data_kelas);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Kelas data);
    }

}
