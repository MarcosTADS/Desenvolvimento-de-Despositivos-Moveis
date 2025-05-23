package com.example.tarefa1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.activity.EdgeToEdge;
import android.view.WindowInsets;

import android.widget.Button;


public class ActivityDetalhamento extends AppCompatActivity {
   Button buttonSair;

    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalhamento);

        buttonSair = findViewById((R.id.buttonSair));

        buttonSair.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ActivityDetalhamento.this, MainActivity.class);
                startActivity(intent);

            }

        });


        View view = findViewById(R.id.mainDetalhamento);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainDetalhamento), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}