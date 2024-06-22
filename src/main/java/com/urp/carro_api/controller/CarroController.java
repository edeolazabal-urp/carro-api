package com.urp.carro_api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urp.carro_api.model.Carro;
import com.urp.carro_api.service.CarroService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")
public class CarroController {
    final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }
    @GetMapping
    public ResponseEntity<List<Carro>> listaTodos() {
        return new ResponseEntity<>(carroService.obtenerTodos(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Carro> crearCarro(@RequestBody Carro carro) {
        System.out.println("Controller: "+ carro);
        return new ResponseEntity<>(carroService.agregarCarro(carro), HttpStatus.CREATED);
    }
}
