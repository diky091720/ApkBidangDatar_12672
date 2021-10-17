package com.example.aplikasibidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class KetigaFragment extends Fragment {
private Button btnHasil;
private EditText txt_jari_jari;
private TextView hasil,hasil1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_ketiga, container, false);
        btnHasil=v.findViewById(R.id.btnHasil);
        txt_jari_jari=v.findViewById(R.id.txt_jari_jari);
        hasil=v.findViewById(R.id.hasil);
        hasil1=v.findViewById(R.id.hasil1);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_jari_jari.getText().toString();
                if(nilai.isEmpty()){
                    txt_jari_jari.setError("Data Tidak Boleh Kosong");
                    txt_jari_jari.requestFocus();
                }else{
                    Double jari=Double.parseDouble(nilai);
                    Double luas=3.14*(jari*jari);
                    Double kell=2*3.14*jari;
                    hasil.setText(String.format("%.2f",luas));
                    hasil1.setText(String.format("%.2f",kell));
                }
            }
        });
        return v;
    }
}