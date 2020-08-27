/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.materdei.tas.core.repository;

import br.edu.materdei.tas.core.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mandy
 */
@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Integer> {
    
}
