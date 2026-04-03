package com.example.labfourfirst;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView btnNewGame, btnContinue, btnOptions, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewGame = findViewById(R.id.btnNewGame);
        btnContinue = findViewById(R.id.btnContinue);
        btnOptions = findViewById(R.id.btnOptions);
        btnAbout = findViewById(R.id.btnAbout);

        btnNewGame.setOnClickListener(v ->
                Toast.makeText(this, "New Game clicked", Toast.LENGTH_SHORT).show());

        btnContinue.setOnClickListener(v ->
                Toast.makeText(this, "Continue clicked", Toast.LENGTH_SHORT).show());

        btnOptions.setOnClickListener(v ->
                Toast.makeText(this, "Options clicked", Toast.LENGTH_SHORT).show());

        btnAbout.setOnClickListener(v ->
                Toast.makeText(this, "About clicked", Toast.LENGTH_SHORT).show());
    }
}
