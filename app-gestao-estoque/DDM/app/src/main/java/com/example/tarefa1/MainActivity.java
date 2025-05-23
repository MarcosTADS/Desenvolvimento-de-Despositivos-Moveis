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
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextSenha;

    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextSenha = findViewById(R.id.editTextSenha);
        buttonLogin = findViewById(R.id.buttonLogin);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String nomeDoUsuario = editTextName.getText().toString();
                String senhaDoUsuario = editTextSenha.getText().toString();
                login(nomeDoUsuario, senhaDoUsuario);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void login(String nome, String senha)
    {
        if(nome.equals("Teste") && senha.equals("123"))
        {
//            String nomeDoUsuario = editTextName.getText().toString();
            Intent intent = new Intent(MainActivity.this, ActivityBoasVindas.class);
            intent.putExtra("nomeDigitado",nome);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Usuário ou senha inválidos", Toast.LENGTH_LONG).show();
        }
    }
}