package com.example.tarefa1.recyclerView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tarefa1.R;
public class ProdutoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView itemImgRV;
    TextView itemDescRV;
    TextView itemCodRV;
    TextView itemUndRV;
    TextView itemQtdEstoqueRV;

    public ProdutoViewHolder(View itemView){
        super(itemView);
        itemView.setOnClickListener(this);
        itemImgRV = itemView.findViewById(R.id.itemImgRV);
        itemDescRV = itemView.findViewById(R.id.itemDescRV);
        itemCodRV = itemView.findViewById(R.id.itemCodRV);
        itemUndRV = itemView.findViewById(R.id.itemUndRV);
        itemQtdEstoqueRV = itemView.findViewById(R.id.itemQtdEstoqueRV);

    }

    @Override
    public void onClick(View v){
        Toast.makeText(v.getContext(), "Item clicado" + getAdapterPosition(), Toast.LENGTH_SHORT).show();
    }


}
