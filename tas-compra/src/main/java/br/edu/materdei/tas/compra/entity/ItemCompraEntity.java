/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.materdei.tas.compra.entity;

import br.edu.materdei.tas.core.entity.ProdutoEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Mandy
 */

@Entity
@Table(name = "itemcompra")
public class ItemCompraEntity {
    @Id @GeneratedValue
    private Integer id;
    
    @Column(nullable = false)
    private Double qtdade;
    
    @Column(nullable = false)
    private Double vltunit;
    
    @ManyToOne
    @JoinColumn(nullable = false)
    private ProdutoEntity produto;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the qtdade
     */
    public Double getQtdade() {
        return qtdade;
    }

    /**
     * @param qtdade the qtdade to set
     */
    public void setQtdade(Double qtdade) {
        this.qtdade = qtdade;
    }

    /**
     * @return the vltunit
     */
    public Double getVltunit() {
        return vltunit;
    }

    /**
     * @param vltunit the vltunit to set
     */
    public void setVltunit(Double vltunit) {
        this.vltunit = vltunit;
    }

    /**
     * @return the produto
     */
    public ProdutoEntity getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(ProdutoEntity produto) {
        this.produto = produto;
    }
}