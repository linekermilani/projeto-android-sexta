package br.comup.projetoup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.botaoAviso);
        button.setOnClickListener(v-> {
            Intent intent = new Intent(this, ListaAvisosActivity.class);
            startActivity(intent);
        });
    }
}