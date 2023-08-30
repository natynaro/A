package com.sebas_seguimiento.seguimiento1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebas_seguimiento.seguimiento1.model.Mono;

public interface IMonoDAO extends JpaRepository<Mono, Long>{
    
}
