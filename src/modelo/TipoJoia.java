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
public class TipoJoia {
 
    private int idTipoJoia;
    private String codigo, descricao;

    public TipoJoia() {
    }

    public TipoJoia(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getIdTipoJoia() {
        return idTipoJoia;
    }

    public void setIdTipoJoia(int idTipoJoia) {
        this.idTipoJoia = idTipoJoia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
