package com.example.aplikasibidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PertamaFragment extends Fragment {
    private Button btnHasil;
    private EditText txt_panjang;
    private TextView hasil,hasil1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_pertama, container, false);
        btnHasil=v.findViewById(R.id.btnHasil);
        txt_panjang =v.findViewById(R.id.txt_panjang);
        hasil =v.findViewById(R.id.hasil);
        hasil1=v.findViewById(R.id.hasil1);


        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1=txt_panjang.getText().toString();
                if(nilai1.isEmpty()){
                    txt_panjang.setError("Data Tidak Boleh Kosong");
                    txt_panjang.requestFocus();
                }   else{
                    Integer panjang = Integer.parseInt(nilai1);


                    Integer luas = panjang*panjang;
                    Integer kell = 4*panjang;
                    hasil.setText(String.valueOf(luas));
                    hasil1.setText(String.valueOf(kell));

                }
            }
        });
        return v;
    }
}