package com.example.nccapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ncc_Main extends AppCompatActivity implements View.OnClickListener{

    private CardView About_NCC, About_Aim, About_Motto, About_Pledge, About_NCC_Song ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ncc_main);

        About_NCC = (CardView) findViewById(R.id.About_Ncc);
        About_Aim = (CardView) findViewById(R.id.Aim);
        About_Motto = (CardView) findViewById(R.id.Motto);
        About_Pledge = (CardView) findViewById(R.id.Pledge);
        About_NCC_Song = (CardView) findViewById(R.id.ncc_song);


        About_NCC.setOnClickListener((View.OnClickListener) this);
        About_Aim.setOnClickListener((View.OnClickListener) this);
        About_Motto.setOnClickListener((View.OnClickListener) this);
        About_Pledge.setOnClickListener((View.OnClickListener) this);
        About_NCC_Song.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;
        switch (v.getId()) {

            case R.id.About_Ncc:
                i = new Intent(this, About_NCC.class);
                startActivity(i);
                break;

            case R.id.Aim:
                i = new Intent(this, About_Aim.class);
                startActivity(i);
                break;

            case R.id.Motto:
                i = new Intent(this, About_Motto.class);
                startActivity(i);
                break;

            case R.id.Pledge:
                i = new Intent(this, About_Pldege.class);
                startActivity(i);
                break;

            case R.id.ncc_song:
                i = new Intent(this, About_NCC_Song.class);
                startActivity(i);
                break;

        }
    }

}
