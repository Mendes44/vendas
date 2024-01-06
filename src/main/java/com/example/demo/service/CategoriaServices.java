package com.example.demo.service;

import com.example.demo.model.CategoriaEnum;
import com.example.demo.model.dto.CategoriaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaServices {
    public List<CategoriaDTO> getAllCategorias(){
        List <CategoriaEnum> categorias = List.of(CategoriaEnum.values());
        List<CategoriaDTO> categoriasDTO = new ArrayList<>();

        for (CategoriaEnum categoriaEnum : categorias ){

            CategoriaDTO categoriaDTO = new CategoriaDTO();
            categoriaDTO.setDescription(categoriaEnum.getDescricao());
            categoriaDTO.setName(categoriaEnum.name());

            categoriasDTO.add(categoriaDTO);
        }
        return categoriasDTO;

    }
}
