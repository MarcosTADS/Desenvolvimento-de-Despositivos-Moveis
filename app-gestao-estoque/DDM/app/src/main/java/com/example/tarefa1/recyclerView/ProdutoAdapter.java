package com.example.tarefa1.recyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import com.example.tarefa1.R;
public class ProdutoAdapter extends RecyclerView.Adapter<ProdutoViewHolder> {

    private List<Produto> listDeProdutos;


    public ProdutoAdapter(List<Produto> listDeProdutos) {
        this.listDeProdutos = listDeProdutos;
    }

    @Override
    public ProdutoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout, parent, false);
        return new ProdutoViewHolder(view);

    }
    @Override
    public void onBindViewHolder(ProdutoViewHolder holder, int position) {
        Produto produtoAtual = listDeProdutos.get(position);

        String imageName = produtoAtual.getImg();
        Context context = holder.itemView.getContext();

        int imageResourceId = context.getResources().getIdentifier(
                imageName,
                "drawable",
                context.getPackageName()
        );

        if (imageResourceId != 0) { // Verifica se o recurso foi encontrado
            holder.itemImgRV.setImageResource(imageResourceId);
        } else {
            // Se o recurso não for encontrado, use uma imagem de placeholder
            holder.itemImgRV.setImageResource(R.drawable.ic_launcher_background); // Certifique-se de ter este drawable
        }

        holder.itemDescRV.setText(produtoAtual.getDescricao());
        holder.itemCodRV.setText(produtoAtual.getCod()); // Adicionando "Cód: " para melhor leitura
        holder.itemUndRV.setText(produtoAtual.getUnd()); // Adicionando "Und: "
        holder.itemQtdEstoqueRV.setText(String.valueOf(produtoAtual.getQuantidadeEmEstoque())); // Convertendo int para String
    }


    @Override
    public  int getItemCount() {
        return listDeProdutos.size();
    }

}
