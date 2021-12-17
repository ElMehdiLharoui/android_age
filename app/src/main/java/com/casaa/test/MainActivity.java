package com.casaa.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void bu (View view) {

            EditText tage=(EditText)findViewById(R.id.tage);

            int anne=Integer.parseInt(tage.getText().toString());

            int dn=2021-anne;

            Toast.makeText(this,"age:"+String.valueOf(dn),Toast.LENGTH_LONG).show();

        }
    }

    }


