/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author skynetx
 */
public class Produto {
    private int idProduto;
    private TipoJoia tipoJoia;
    private String codigo;
    private String nome;   
    private float valorCusto;
    private float valorVenda;
    private int quantidadeEstoque;

    public Produto() {
    }

    public Produto(String codigo, String nome, float valorCusto, float valorVenda, int quantidadeEstoque, TipoJoia tipoJoia) {
        this.tipoJoia = tipoJoia;
        this.codigo = codigo;
        this.nome = nome;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public TipoJoia getTipoJoia() {
        return tipoJoia;
    }

    public void setTipoJoia(TipoJoia tipoJoia) {
        this.tipoJoia = tipoJoia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(float valorCusto) {
        this.valorCusto = valorCusto;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    

}