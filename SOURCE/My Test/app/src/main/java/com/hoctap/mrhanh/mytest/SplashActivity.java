package com.hoctap.mrhanh.mytest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                screenRouter();
            }

        },2000);
    }
    void screenRouter(){
        SharedPreferences sharedPreferences=getSharedPreferences("Android005",MODE_PRIVATE);
        String phoneNunber= sharedPreferences.getString("phone_number",null);
        if(phoneNunber==null){
            Intent intent=new Intent(this,LoginActivity.class);
            startActivity(intent);
        }
        else {
            Intent intent=new Intent(this,MainActivity.class);
            User user=new User();
            user.setId(1);
            user.setPhoneNumber("+84123456789");
            user.setUsername("Vu Trong Hanh01");
            user.setProfileUrl("https://photos.google.com/photo/AF1QipOuiDm30QTjDXk98Q7DtrnHCNbedRm5z62Nv2HY");

            intent.putExtra("user",user);
            startActivity(intent);
        }

    }
}
