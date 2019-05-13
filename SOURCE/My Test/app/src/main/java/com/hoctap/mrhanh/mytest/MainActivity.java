package com.hoctap.mrhanh.mytest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

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
        //Bướ
        EditText editText =findViewById( R.id.edt_number_phone );
        editText.setText( winUser.getPhoneNumber() );

    }

}
