package com.sebas_seguimiento.seguimiento1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebas_seguimiento.seguimiento1.dao.IMonoDAO;
import com.sebas_seguimiento.seguimiento1.model.Mono;

@Service
public class MonoService implements IMonoService{
     @Autowired
    private IMonoDAO monoDAO;
    @Override
    public List<Mono> findAll() {
        return  monoDAO.findAll();
    }

    @Override
    public Mono findById(Long id) {
        return monoDAO.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        monoDAO.deleteById(id);
    }

    @Override
    public Mono save(Mono mono) {
        return monoDAO.save(mono);
    }
}
