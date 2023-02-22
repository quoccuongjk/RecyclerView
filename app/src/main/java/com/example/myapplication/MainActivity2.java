package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView;
    TextView tv_name, tv_class;
    ThongTin tt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = findViewById(R.id.dt_img);
        tv_name = findViewById(R.id.dt_name);
        tv_class = findViewById(R.id.dt_class);
        Intent intent = getIntent();
        tt = (ThongTin) intent.getSerializableExtra("tt");
        imageView.setImageResource(tt.getImg());
        tv_name.setText(tt.getName());
        tv_class.setText(tt.getDetail());

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Chi tiết");
        actionBar.setDisplayShowHomeEnabled(true);
        tv_class.setMovementMethod(new ScrollingMovementMethod());
    }
}