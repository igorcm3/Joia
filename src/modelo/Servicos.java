/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author mateu
 */
public class Servicos {
    private int idServicos;
    private Cliente cliente;
    private String codigo;
    private String nome;
    private float valor;

    public Servicos() {
    }

    public Servicos(int idServicos, Cliente cliente, String codigo, String nome, float valor) {
        this.idServicos = idServicos;
        this.cliente = cliente;
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public int getIdServicos() {
        return idServicos;
    }

    public void setIdServicos(int idServicos) {
        this.idServicos = idServicos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
