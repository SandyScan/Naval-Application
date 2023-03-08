package com.example.nccapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView Ncc_Main, Syllabus_main, Main_Precis, Main_training_Videos, Main_daily_Updates, Main_Query;

    private ImageView Admin_Login_Page ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Admin_Login_Page = (ImageView) findViewById(R.id.tl_br_admin_login);

        Admin_Login_Page.setOnClickListener((View.OnClickListener) this);

        Ncc_Main = (CardView) findViewById(R.id.Ncc);
        Syllabus_main = (CardView) findViewById(R.id.Syllabus);
        Main_Precis = (CardView) findViewById(R.id.Precis);
        Main_training_Videos = (CardView) findViewById(R.id.Training_Videos);
        Main_daily_Updates = (CardView) findViewById(R.id.Daily_Update);
        Main_Query = (CardView) findViewById(R.id.query);

        Ncc_Main.setOnClickListener((View.OnClickListener) this);
        Syllabus_main.setOnClickListener((View.OnClickListener) this);
        Main_Precis.setOnClickListener((View.OnClickListener) this);
        Main_training_Videos.setOnClickListener((View.OnClickListener) this);
        Main_daily_Updates.setOnClickListener((View.OnClickListener) this);
        Main_Query.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;
        switch (v.getId()) {

            case R.id.Ncc:
                i = new Intent(this, Ncc_Main.class);
                startActivity(i);
                break;

            case R.id.Syllabus:
                i = new Intent(this, Syllabus_Main.class);
                startActivity(i);
                break;

            case R.id.Precis:
                i = new Intent(this, Main_Precis.class);
                startActivity(i);
                break;

            case R.id.Training_Videos:
                i = new Intent(this, Main_Training_Videos.class);
                startActivity(i);
                break;

            case R.id.Daily_Update:
                i = new Intent(this, Main_Daily_Updates.class);
                startActivity(i);
                break;

            case R.id.query:
                i = new Intent(this, Main_Query.class);
                startActivity(i);
                break;

            case R.id.tl_br_admin_login:
                i = new Intent(this, Admin_Login_Page.class);
                startActivity(i);

        }
    }

}