package com.android.example.mokletpay.petugas;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.example.mokletpay.R;

public class StatusPembayaran extends AppCompatActivity {
    private Dialog dialog;
    private Button ShowDialog;
    private Dialog statusdialog;
    private Button ShowStatusDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShowDialog = findViewById(R.id.dialog_btn);

        dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog_layout);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });

        ShowStatusDialog = dialog.findViewById(R.id.status);

        statusdialog = new Dialog(this);
        statusdialog.setContentView(R.layout.modal_kurang_bayar);

        statusdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ShowStatusDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                statusdialog.show();
            }
        });

        Button Simpan = statusdialog.findViewById(R.id.simpan);
        Simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(StatusPembayaran.this, "Simpan...", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

    }
}
