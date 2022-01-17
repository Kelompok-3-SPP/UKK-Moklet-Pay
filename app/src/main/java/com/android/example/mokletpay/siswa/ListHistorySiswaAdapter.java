package com.android.example.mokletpay.siswa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.R;

import java.util.ArrayList;



public class ListHistorySiswaAdapter extends RecyclerView.Adapter<ListHistorySiswaAdapter.ListViewHolder> {
    private ArrayList<HistorySiswa> listHistorySiswa;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    public ListHistorySiswaAdapter(ArrayList<HistorySiswa> list) {
        this.listHistorySiswa = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.container_history_siswa, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        HistorySiswa historysiswa = listHistorySiswa.get(position);
        holder.tvBulan.setText(historysiswa.getBulan());
        holder.tvTanggal.setText(historysiswa.getTanggal());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listHistorySiswa.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHistorySiswa.size();
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
        void onItemClicked(HistorySiswa data);
    }
}