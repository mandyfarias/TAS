/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.materdei.tas.estoque.repository;

/**
 *
 * @author Mandy
 */
import br.edu.materdei.tas.estoque.entity.EstoqueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRespository extends JpaRepository<EstoqueEntity, Integer>{
    
}
