package com.hydra.joker.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class NormalActivity extends AppCompatActivity {

    private Button mBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        mBtn1 = findViewById(R.id.Btn1);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View mToastView = inflater.inflate(R.layout.view_toast, null);
                ImageView mToastImage = mToastView.findViewById(R.id.toast_ima);
                mToastImage.setImageResource(R.mipmap.xjj);
                TextView mToastText = mToastView.findViewById(R.id.toast_text);
                mToastText.setText("许姣姣大美女");

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(mToastView);
                toast.show();
            }
        });
    }
}
