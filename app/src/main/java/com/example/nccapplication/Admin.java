package com.example.nccapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Admin extends AppCompatActivity implements View.OnClickListener {

    private CardView Upload_Notice, Upload_PDF, Delete_Notice;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        Upload_Notice = (CardView) findViewById(R.id.Upload_Notice);
        Upload_PDF = (CardView) findViewById(R.id.Upload_PDF);
        Delete_Notice = (CardView) findViewById(R.id.Delete_Notice);

        Upload_Notice.setOnClickListener((View.OnClickListener) this);
        Upload_PDF.setOnClickListener((View.OnClickListener) this);
        Delete_Notice.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {

            case R.id.Upload_Notice:
                i = new Intent(this, Upload_Notice.class);
                startActivity(i);
                break;

            case R.id.Upload_PDF:
                i = new Intent(this, Upload_PDF.class);
                startActivity(i);
                break;

            case R.id.Delete_Notice:
                i = new Intent(this, Delete_Notice.class);
                startActivity(i);
                break;

        }
    }
}