package com.example.claytonandrade.cardview;

/**
 * Created by claytonandrade on 18/05/17.
 */

public class Pessoa {

    private String nome_pessoa;
    private String idade_pessoa;

    public String getNome_pessoa() {
        return nome_pessoa;
    }

    public void setNome_pessoa(String nome_pessoa) {
        this.nome_pessoa = nome_pessoa;
    }

    public String getIdade_pessoa() {
        return idade_pessoa;
    }

    public void setIdade_pessoa(String idade_pessoa) {
        this.idade_pessoa = idade_pessoa;
    }

    public int getFoto_pessoa() {
        return foto_pessoa;
    }

    public void setFoto_pessoa(int foto_pessoa) {
        this.foto_pessoa = foto_pessoa;
    }

    private int foto_pessoa;

    public Pessoa(final String nome_pessoa, final String idade_pessoa, final int foto_pessoa){
        this.nome_pessoa = nome_pessoa;
        this.idade_pessoa = idade_pessoa;
        this.foto_pessoa = foto_pessoa;
    }
}
