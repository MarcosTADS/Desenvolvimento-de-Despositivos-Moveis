package com.example.tarefa1;


import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.activity.EdgeToEdge;
import android.graphics.Color;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityDetalhamento extends AppCompatActivity {

    EditText editTextPesquisarProdutos;
    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalhamento);

        editTextPesquisarProdutos = findViewById(R.id.editTextPesquisarProdutos);

        LinearLayout listarProdutosBarraNav = findViewById(R.id.ListarProdutosBarraPesquisa);
        Button listarProdutosBotaoPesquisar = new Button(this);

        listarProdutosBotaoPesquisar.setText("Pesquisar");
        listarProdutosBotaoPesquisar.setBackgroundColor(Color.parseColor("#0F4C81"));
        listarProdutosBotaoPesquisar.setTextColor(Color.WHITE);
        listarProdutosBotaoPesquisar.setPadding(10, 0, 10, 0);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        layoutParams.setMargins(10,0,0,0);
//        layoutParams.gravity = Gravity.CENTER_HORIZONTAL;

        listarProdutosBotaoPesquisar.setLayoutParams(layoutParams);

        listarProdutosBotaoPesquisar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String itemPesquisado = editTextPesquisarProdutos.getText().toString();
                Toast.makeText(ActivityDetalhamento.this, "Pesquisando o produto: " + itemPesquisado, Toast.LENGTH_SHORT).show();
            }
        });

        listarProdutosBarraNav.addView(listarProdutosBotaoPesquisar);


        View view = findViewById(R.id.mainDetalhamento);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainDetalhamento), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}