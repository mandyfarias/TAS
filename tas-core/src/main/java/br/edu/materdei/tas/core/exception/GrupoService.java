/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.materdei.tas.core.exception;

import br.edu.materdei.tas.core.entity.GrupoEntity;
import br.edu.materdei.tas.core.repository.GrupoRepository;
import br.edu.materdei.tas.core.service.IBaseService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mandy
 */
@Service
public class GrupoService implements IBaseService<GrupoEntity>{

    private GrupoRepository repostory;
    
    @Override
    public List<GrupoEntity> findAll() {
        return repostory.findAll();
    }

    @Override
    public GrupoEntity findById(Integer id) throws ResourceNotFoundException {
    
    }

    @Override
    public GrupoEntity save(GrupoEntity entity) {
    }

    @Override
    public void delete(Integer id) throws ResourceNotFoundException {
    }
    
}
