package com.example.tarefa1;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ActivityBoasVindas extends AppCompatActivity {

    Button buttonSair, buttonDetalhes;

    @Override
    protected void onCreate(Bundle saveInstanceState)
   {
       super.onCreate(saveInstanceState);
       EdgeToEdge.enable(this);
       setContentView(R.layout.activity_boas_vindas);

       TextView textViewNome = findViewById(R.id.textViewNome);
       String nomeDoUsuario = getIntent().getStringExtra("nomeDigitado");
       textViewNome.setText("Sr(a). " + nomeDoUsuario);

       buttonSair = findViewById(R.id.buttonSair);
       buttonSair.setOnClickListener(new View.OnClickListener(){

           @Override
           public void onClick(View v)
           {
               Intent intent = new Intent(ActivityBoasVindas.this, MainActivity.class);
               startActivity(intent);
           }
       });

       buttonDetalhes = findViewById(R.id.buttonDetalhes);
       buttonDetalhes.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v)
           {
               Intent intent = new Intent(ActivityBoasVindas.this, ActivityDetalhamento.class);
               startActivity(intent);
               finish();
           }
       });


   }
}