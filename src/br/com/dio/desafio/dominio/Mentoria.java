package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria(){

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + "\n Descricao: " + getDescricao() + "\n Data: " + getData();
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
}
