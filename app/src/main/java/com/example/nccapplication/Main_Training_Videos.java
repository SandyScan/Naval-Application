package com.example.nccapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Main_Training_Videos extends AppCompatActivity implements View.OnClickListener {

    private CardView Training_Videos_Junior_Common_Subject, Training_Videos_Senior_Common_Subject, Training_Videos_Junior_Special_Subject, Training_Videos_Senior_Special_Subject, Main_Training_Videos_Drill;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_training_videos);

        Training_Videos_Junior_Common_Subject = (CardView) findViewById(R.id.trng_vid_jr_cmn_sub);
        Training_Videos_Senior_Common_Subject = (CardView) findViewById(R.id.trng_vid_sr_cmn_sub);
        Training_Videos_Junior_Special_Subject = (CardView) findViewById(R.id.trng_vid_jr_spl_sub);
        Training_Videos_Senior_Special_Subject = (CardView) findViewById(R.id.trng_vid_sr_spl_sub);
        Main_Training_Videos_Drill = (CardView) findViewById(R.id.trng_vid_drills) ;

        Training_Videos_Junior_Common_Subject.setOnClickListener((View.OnClickListener) this);
        Training_Videos_Senior_Common_Subject.setOnClickListener((View.OnClickListener) this);
        Training_Videos_Junior_Special_Subject.setOnClickListener((View.OnClickListener) this);
        Training_Videos_Senior_Special_Subject.setOnClickListener((View.OnClickListener) this);
        Main_Training_Videos_Drill.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {

            case R.id.trng_vid_jr_cmn_sub:
                i = new Intent(this, Training_Videos_Junior_Common_Subjects.class);
                startActivity(i);
                break;

            case R.id.trng_vid_sr_cmn_sub:
                i = new Intent(this, Training_Videos_Senior_Common_Subjects.class);
                startActivity(i);
                break;

            case R.id.trng_vid_jr_spl_sub:
                i = new Intent(this, Training_Videos_Junior_Special_Subjects.class);
                startActivity(i);
                break;

            case R.id.trng_vid_sr_spl_sub:
                i = new Intent(this, Training_Videos_Senior_Special_Subjects.class);
                startActivity(i);
                break;
            case R.id.trng_vid_drills:
                i = new Intent(this, Main_Training_Videos_Drill.class);
                startActivity(i);
                break;

        }
    }
}