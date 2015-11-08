/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Victor
 */
public class Produto_Model {

    public Produto_Model() {

    }

    public Produto_Model(int id_produto, String nome, double valor, int qtde) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.valor = valor;
        this.qtde = qtde;
    }

    private int id_produto;
    private String nome;
    private double valor;
    private int qtde;

    public int getId_produto() {

        return id_produto;
    }

    public void setId_produto(int id_produto) {

        this.id_produto = id_produto;

    }

    public double getValor() {

        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;

    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getQtde() {

        return qtde;
    }

    public void setQtde(int qtde) {

        this.qtde = qtde;

    }
}
