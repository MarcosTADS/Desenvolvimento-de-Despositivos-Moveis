package com.example.tarefa1;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.activity.EdgeToEdge;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import android.util.Log;

import com.example.tarefa1.api_interface.PostService;
import com.example.tarefa1.api_interface.RetrofitClient;
import com.example.tarefa1.model.Post;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tarefa1.recyclerView.Produto;
import com.example.tarefa1.recyclerView.ProdutoAdapter;
import com.example.tarefa1.recyclerView.ProdutoViewHolder;

public class ActivityDetalhamento extends AppCompatActivity {

    private EditText editTextPesquisarProdutos;
    private Button listarProdutosBotaoSair;
    private RecyclerView recyclerView;
    private ProdutoAdapter produtoAdapter;
    private List<Produto> dadosDaLista;



    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalhamento);

        editTextPesquisarProdutos = findViewById(R.id.editTextPesquisarProdutos);
        listarProdutosBotaoSair = findViewById(R.id.ListaProdutosBotaoSair);
        recyclerView = findViewById(R.id.recyclerView);


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

        listarProdutosBotaoSair.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActivityDetalhamento.this, MainActivity.class);
                startActivity(intent);
            }
        });



        dadosDaLista = new ArrayList<>();

        dadosDaLista.add(new Produto("Filamento PETG", "001", "Rolo/1k", "Eletrônica", "filamento", 40));
        dadosDaLista.add(new Produto("Cola Transparente", "002", "37g", "Eletrônica", "cola", 10));
        dadosDaLista.add(new Produto("Sensor Tcrt5000", "003", "Unidade", "Eletrônica", "sensor", 15));
        dadosDaLista.add(new Produto("Motor De Passo", "004", "Unidade", "Eletrônica", "motor_passo", 8));
        dadosDaLista.add(new Produto("Capacitor Cbb61", "005", "Unidade", "Eletrônica", "capacitor", 20));
        dadosDaLista.add(new Produto("Cabo Flexível", "006", "Unidade", "Eletrônica", "fio", 40));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        produtoAdapter = new ProdutoAdapter(dadosDaLista);
        recyclerView.setAdapter(produtoAdapter);

        View view = findViewById(R.id.mainDetalhamento);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainDetalhamento), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


}