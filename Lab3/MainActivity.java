package com.example.labthrefirst;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnWhite).setOnClickListener(v -> openColor(Color.WHITE));
        findViewById(R.id.btnRed).setOnClickListener(v -> openColor(Color.RED));
        findViewById(R.id.btnBlue).setOnClickListener(v -> openColor(Color.BLUE));
        findViewById(R.id.btnGreen).setOnClickListener(v -> openColor(Color.GREEN));
        findViewById(R.id.btnCyan).setOnClickListener(v -> openColor(Color.CYAN));
        findViewById(R.id.btnLightGray).setOnClickListener(v -> openColor(Color.LTGRAY));
        findViewById(R.id.btnMagenta).setOnClickListener(v -> openColor(Color.MAGENTA));
    }

    private void openColor(int color) {
        Intent intent = new Intent(this, ColorActivity.class);
        intent.putExtra("color", color);
        startActivity(intent);
    }
}
