package com.example.student.tgb_cau1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_dn;
    CheckBox cb_luu;
    EditText ed_tk1,ed_tk2;
    AlertDialog.Builder dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_tk1 = findViewById(R.id.ed_tk1);
        ed_tk2 = findViewById(R.id.ed_tk2);


        cb_luu = findViewById(R.id.cb_luu);
        dialog = new AlertDialog.Builder(  this );
        dialog.setTitle("Thong bao");

        btn_dn = findViewById(R.id.btn_dn);
        btn_dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb_luu.isChecked()){
                    dialog.setMessage("chao mung ban dang nhap he thong,thong tin cua ban da duoc luu").show();
                }
                else {
                    dialog.setMessage("chao mung ban dang nhap he thong,thong tin cua ban khong duoc luu").show();
                }
            }
        });
        Button btnThoat=findViewById(R.id.btn_Thoat);
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setMessage("da thoat").show();

            }
        });
    }
}

