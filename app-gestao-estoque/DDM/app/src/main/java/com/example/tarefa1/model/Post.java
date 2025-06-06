package com.example.tarefa1.model;

import com.google.gson.annotations.SerializedName;
public class Post {
    private int id;
    private String descricao, cod, und_medida, categoria, imagem;
    private int qtd_estoque;

    public Post(int id, String descricao, String cod, String und_medida, String categoria, String imagem, int qtd_estoque){
        this.id = id;
        this.descricao = descricao;
        this.cod = cod;
        this.und_medida = und_medida;
        this.categoria = categoria;
        this. imagem = imagem;
        this.qtd_estoque = qtd_estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao(){
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getUnd_medida() {
        return und_medida;
    }

    public void setUnd_medida(String und_medida) {
        this.und_medida = und_medida;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public String toString() {
        return "Post{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", cod='" + cod + '\'' +
                ", und_medida='" + und_medida + '\'' +
                ", categoria='" + categoria + '\'' +
                ", imagem='" + imagem + '\'' +
                ", qtd_estoque=" + qtd_estoque +
                '}';
    }
}
