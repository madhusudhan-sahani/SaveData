package com.example.accemy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getfName();
    }
    public void getfName() {
        Toast.makeText(this, "getfName", Toast.LENGTH_SHORT).show();;
    }
}
