/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;



/**
 *
 * @author mateu
 */
public class Agendamento {
    private int idAgendamento;
    private Servicos servico;
    private Date dataInicio;
    private Date dataEntrega;
    private String descricao;
    private float valorFinal;

    public Agendamento() {
    }

    public Agendamento(int idAgendamento, Servicos servico, Date dataInicio, Date dataEntrega, String descricao, float valorFinal) {
        this.idAgendamento = idAgendamento;
        this.servico = servico;
        this.dataInicio = dataInicio;
        this.dataEntrega = dataEntrega;
        this.descricao = descricao;
        this.valorFinal = valorFinal;
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public Servicos getServico() {
        return servico;
    }

    public void setServico(Servicos servico) {
        this.servico = servico;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    
}
