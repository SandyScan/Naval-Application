package com.example.nccapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Admin_Login_Page extends AppCompatActivity implements View.OnClickListener {

    private Button Admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login_page);

        Admin = (Button) findViewById(R.id.login_admin_button);

        Admin.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
                Intent intent = new Intent(this, Admin.class);
                startActivity(intent);

        }
    }
