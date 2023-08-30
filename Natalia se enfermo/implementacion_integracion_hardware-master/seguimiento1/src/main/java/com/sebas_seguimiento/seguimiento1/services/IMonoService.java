package com.sebas_seguimiento.seguimiento1.services;
import java.util.List;

import com.sebas_seguimiento.seguimiento1.model.Mono;

public interface IMonoService {
    
    public List<Mono> findAll();
    public Mono findById(Long id);
    public void deleteById(Long id);
    public Mono save(Mono estudiante);
    
}
