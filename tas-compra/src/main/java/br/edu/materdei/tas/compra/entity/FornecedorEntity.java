/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.materdei.tas.compra.entity;

import br.edu.materdei.tas.core.entity.Pessoa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Mandy
 */
@Entity
@Table(name = "fornecedor")
public class FornecedorEntity extends Pessoa {
    @Column(length = 50)
    private String contato;
    
    @Column(length = 14, nullable = false)
    private String cnpj;

    /**
     * @return the contato
     */
    public String getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}