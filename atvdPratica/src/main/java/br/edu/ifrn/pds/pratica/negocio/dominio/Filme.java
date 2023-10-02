/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifrn.pds.pratica.negocio.dominio;

/**
 *
 * @author 20201114010053
 */
public class Filme {
    
    private int id;
    private String titulo;
    private int duracao;
    private int ano;
    private double avaliacao;
    
    public Filme(){
        
    }
    public Filme(int id,String titulo, int duracao, int ano, double avaliacao){
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.ano = ano;
        this.avaliacao = avaliacao;
    }
    public Filme(String titulo, int duracao, int ano, double avaliacao){
        this.titulo = titulo;
        this.duracao = duracao;
        this.ano = ano;
        this.avaliacao = avaliacao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getAno() {
        return ano;
    }

    public double getAvaliacao() {
        return avaliacao;
    }
    
}
