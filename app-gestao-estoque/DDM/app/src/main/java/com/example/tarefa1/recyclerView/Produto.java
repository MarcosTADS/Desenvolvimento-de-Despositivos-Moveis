package com.example.tarefa1.recyclerView;

public class Produto {

    String descricao, cod, und, categoria,img;
    int quantidadeEmEstoque;

    public Produto(String descricao, String cod, String und, String categoria, String img, int quantidadeEmEstoque){
        this.img = img;
        this.descricao = descricao;
        this.cod = cod;
        this.und = und;
        this.categoria = categoria;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters
    public String getDescricao(){
        return descricao;
    }

    public String getCod(){
        return cod;
    }

    public String getUnd(){
        return und;
    }

    public String getCategoria(){
        return categoria;
    }

    public String getImg(){
        return img;
    }

    public int getQuantidadeEmEstoque(){
        return quantidadeEmEstoque;
    }

    // Setters
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setCod(String cod){
        this.cod = cod;
    }

    public void setUnd(String und){
        this.und = und;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setImg(String img){
        this.img = img;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque){
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
