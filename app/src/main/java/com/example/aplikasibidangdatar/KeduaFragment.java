package com.example.aplikasibidangdatar;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class KeduaFragment extends Fragment {
private EditText txt_alas, txt_tinggi;
private Button btnHasil;
private TextView hasil,hasil1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_kedua, container, false);
        txt_alas=v.findViewById(R.id.txt_alas);
        txt_tinggi=v.findViewById(R.id.txt_tinggi);
        btnHasil=v.findViewById(R.id.btnHasil);
        hasil=v.findViewById(R.id.hasil);
        hasil1=v.findViewById(R.id.hasil1);

    btnHasil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String nilai1=txt_alas.getText().toString();
            String nilai2=txt_tinggi.getText().toString();
            if(nilai1.isEmpty()){
                txt_alas.setError("Data Tidak Boleh Kosong");
                txt_tinggi.requestFocus();
            }else if(nilai2.isEmpty()){
                txt_alas.setError("Data Tidak Boleh Kosong");
                txt_tinggi.requestFocus();
            }   else{
                Double alas = Double.parseDouble(nilai1);
                Double tinggi = Double.parseDouble(nilai2);

                Double luas = 0.5* alas * tinggi;
                Double kell = alas+alas+alas;
                hasil.setText(String.format("%.2f",luas));
                hasil1.setText(String.format("%.2f",kell));

            }



        }
    });

        return v;
    }
}