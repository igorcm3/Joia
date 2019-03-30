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
    private Estoque estoque;
    private String codigo,nome;
    private TipoJoia tipoJoia;
    private float custo,venda;

    public Produto() {
    }

    public Produto(Estoque estoque, String codigo, String nome, TipoJoia tipoJoia, float custo, float venda) {
        this.estoque = estoque;
        this.codigo = codigo;
        this.nome = nome;
        this.tipoJoia = tipoJoia;
        this.custo = custo;
        this.venda = venda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
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

    public TipoJoia getTipoJoia() {
        return tipoJoia;
    }

    public void setTipoJoia(TipoJoia tipoJoia) {
        this.tipoJoia = tipoJoia;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getVenda() {
        return venda;
    }

    public void setVenda(float venda) {
        this.venda = venda;
    }
    
    
}
