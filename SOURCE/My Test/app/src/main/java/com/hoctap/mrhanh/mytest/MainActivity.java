package com.hoctap.mrhanh.mytest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kofigyan.stateprogressbar.StateProgressBar;
import com.squareup.picasso.Picasso;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    TextView tvPhoneNumber,tvName,tvEdit;
    ImageView imgAvatar;

    String[] descriptionData = {"Thành viên", "Bạc", "Vàng", "Bạch kim"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        final StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
        stateProgressBar.setStateDescriptionData(descriptionData);
        init();
        //getData();
        Picasso.get()
                .load("https://i.ytimg.com/vi/TXIVq_SXnUA/maxresdefault.jpg").into(imgAvatar);


        Button btnClick=findViewById(R.id.btn_click);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                switch (stateProgressBar.getCurrentStateNumber()){
                    case 1:
                        stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO);
                        break;
                    case 2:
                        stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.THREE);
                        break;
                    case 3:
                        stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.FOUR);
                        break;
                    case 4:
                        stateProgressBar.setAllStatesCompleted(true);
                        break;
                }
            }
        });
    }
    /*void getData(){
       User user=(User) getIntent().getSerializableExtra("user");
       tvPhoneNumber.setText(user.getPhoneNumber());

    }*/
    void init(){

        tvPhoneNumber= findViewById(R.id.tv_phone_number);
        tvName=findViewById(R.id.tv_name);
        tvEdit=findViewById(R.id.tv_edit);
        imgAvatar=findViewById(R.id.img_avatar);
    }

}
