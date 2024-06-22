package com.urp.carro_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urp.carro_api.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Integer>{
    
}
