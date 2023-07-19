package com.ibrahimaydin.girisekran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class arayuz extends AppCompatActivity {
    private TextView textView2;
    private String gelenadi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arayuz);
        Intent gelenintent=  getIntent();
        gelenadi=  gelenintent.getStringExtra("kullanicAdi");
        Toast.makeText(this, "Hoşheldin "+gelenadi, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        Intent backintent=new Intent(arayuz.this,MainActivity.class);

    startActivity(backintent);}
}