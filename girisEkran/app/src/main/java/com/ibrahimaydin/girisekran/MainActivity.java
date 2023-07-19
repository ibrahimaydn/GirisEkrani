package com.ibrahimaydin.girisekran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private EditText kullanicAdi,sifre;
    private String kAdi, kSifre, gercekad ="ibrahim", gerceksifre ="1234a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kullanicAdi=(EditText)findViewById(R.id.ad);
        sifre=(EditText)findViewById(R.id.sifre);
    }
    public void btngiris (View view){
        kAdi=kullanicAdi.getText().toString();
        kSifre=sifre.getText().toString();
if(!TextUtils.isEmpty(kAdi)){
    if(!TextUtils.isEmpty(kSifre)){
        if(kAdi.equals(gercekad)){
            if(kSifre.equals(gerceksifre)){ //geçiş yapmak intent ile
                Intent intent=new Intent(MainActivity.this,arayuz.class);
        intent.putExtra("kullanicAdi",kAdi);
     finish();
        startActivity(intent);
            }else
                Toast.makeText(this, "Yanlış şifre girdiniz", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(this, "Yanlış kullanıcı adı girdiniz", Toast.LENGTH_LONG).show();
    }else
        Toast.makeText(this, "Boş şifre girmeyiniz", Toast.LENGTH_SHORT).show();

}else
    Toast.makeText(this, "Boş kullanıcı adı girmeyiniz", Toast.LENGTH_SHORT).show();

    }
}