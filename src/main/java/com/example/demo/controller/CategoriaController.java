package com.example.demo.controller;

import com.example.demo.model.CategoriaEnum;
import com.example.demo.model.dto.CategoriaDTO;
import com.example.demo.service.CategoriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaServices categoriaServices;
    @GetMapping
    public List<CategoriaDTO> getAllCategorias(){
       return categoriaServices.getAllCategorias();
    }


}
