package com.viethcn.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

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

        firebaseAuth = FirebaseAuth.getInstance();

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tenDangNhap = edtTenDangNhap.getText().toString();
                String matKhau = edtNhapPass.getText().toString();
                String rePass = edtRePass.getText().toString();

                // Check if passwords match
                if (!matKhau.equals(rePass)) {
                    Toast.makeText(Register.this, "Mật khẩu nhập lại không khớp", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Proceed with Firebase authentication
                firebaseAuth.createUserWithEmailAndPassword(tenDangNhap, matKhau)
                        .addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(Register.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(Register.this, com.viethcn.myapplication.Login.class));
                                } else {
                                    Toast.makeText(Register.this, "Đăng ký thất bại", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        txtDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, com.viethcn.myapplication.Login.class));
            }
        });
    }
}
