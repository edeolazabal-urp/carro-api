package com.urp.carro_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.urp.carro_api.model.Carro;
import com.urp.carro_api.repository.CarroRepository;

@Service
public class CarroService {
    final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }
    // Devuelve todos los registros de la tabla
    public List<Carro> obtenerTodos() {
        return carroRepository.findAll();
    }
    // Adiciona registro a la tabla
    public Carro agregarCarro(Carro carro) {
        System.out.println(carro);
        return carroRepository.save(carro);
    }
    
}
