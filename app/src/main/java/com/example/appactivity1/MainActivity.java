package com.example.appactivity1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //public final static int[] colors = {R.color.white, R.color.black, R.color.blue, R.color.tea};

    private Button configBtn;
    private Button hotBtn;
    private Button shareBtn;
    private Button notiBtn;
    private RelativeLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configBtn = findViewById(R.id.config_btn);
        hotBtn = findViewById(R.id.hot_button);
        shareBtn = findViewById(R.id.share_button);
        notiBtn = findViewById(R.id.noti_button);
        layout = findViewById(R.id.profile_base_container);

        configBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent i = new Intent(MainActivity.this, Activity2.class);


                startActivityForResult(i, 200);


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            switch (requestCode){
                case 200:
                    layout.setBackgroundColor(Color.argb(255, data.getExtras().getInt("red"), data.getExtras().getInt("green"), data.getExtras().getInt("blue")));

                    break;
            }
        }

    }
}
