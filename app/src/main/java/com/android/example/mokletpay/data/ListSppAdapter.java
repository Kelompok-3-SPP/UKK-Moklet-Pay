package com.android.example.mokletpay.data;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class ListSppAdapter extends
                RecyclerView.Adapter<ListSppAdapter.ListViewHolder>{

    private final ArrayList<Spp> listSpp;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListSppAdapter(ArrayList<Spp> list){
        this.listSpp=list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.container_data_spp, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Spp spp = listSpp.get(position);
        holder.tvTahun.setText(spp.getTahun());
        holder.tvNominal.setText(spp.getNominal());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listSpp.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSpp.size();
    }

    class ListViewHolder extends
            RecyclerView.ViewHolder {
        TextView tvTahun, tvNominal;

        ListViewHolder(View itemView){
            super(itemView);
            tvTahun=itemView.findViewById(R.id.tv_tahun);
            tvNominal=itemView.findViewById(R.id.tv_nominal);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Spp data);
    }
}
