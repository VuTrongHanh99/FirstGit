package com.hoctap.mrhanh.mytest;

import android.annotation.SuppressLint;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.login_layout );
        // tạo đối tượng User
        User winUser = new User();
        winUser.setId( 1 );
        winUser.setPhoneNumber( "0987421421" );
        winUser.setProfileUrl( "http://" );
        winUser.setUsername( "HanhTP" );
        //Toast.makeText( this, winUser.username, Toast.LENGTH_LONG ).show();
        //Toast.makeText( this, "Hello Toast", Toast.LENGTH_LONG ).show();
        //Sử dụng đối tượng được khai báo trong xml
        //Bước 1 găn id cho đối tượng trong xml
        //Bước 2 tạo tên mới và găn lại cho đôi tượng đấy
        //


    }

}
