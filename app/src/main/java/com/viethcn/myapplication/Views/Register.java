package com.viethcn.myapplication.Views;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.viethcn.myapplication.R;

public class Register extends AppCompatActivity {

    TextView txtDangNhap;

    Button btnDangKy;
    EditText edtTenDangNhap, edtNhapPass, edtRePass;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        txtDangNhap = findViewById(R.id.txtDangNhap);
        btnDangKy = findViewById(R.id.btnDangKy);
        edtTenDangNhap = findViewById(R.id.edtTenDangNhap);
        edtNhapPass = findViewById(R.id.edtNhapPass);
        edtRePass = findViewById(R.id.edtRePass);

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String tenDangNhap = edtTenDangNhap.getText().toString();
            String matKHau = edtNhapPass.getText().toString();
            String RePass = edtRePass.getText().toString();
            }
        });

        txtDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, Login.class));
            }
        });
    }
}