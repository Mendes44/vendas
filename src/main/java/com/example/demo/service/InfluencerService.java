package com.example.demo.service;

import com.example.demo.model.CategoriaEnum;
import com.example.demo.model.Influencer;
import com.example.demo.model.dto.InfluencerDTO;
import com.example.demo.repository.InfluencerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class InfluencerService {

    //Injenção da dependencia - Camada de Repositoru = Aqui indico que minha class depende da class Influncer
    @Autowired
    private InfluencerRepository influencerRepository;


    //Obter a Lista de Influencers
    public List<Influencer> getAllInfluencer(){

        return influencerRepository.findAll();
    }


    //Cadastrar o Influencer
    public Influencer saveInfluencer(InfluencerDTO influencerDTO){
       Influencer influencer = new Influencer();
       influencer.setName(influencerDTO.getName());
       influencer.setEmail(influencerDTO.getEmail());
        influencer.setBirthDate(influencerDTO.getBirthDate());
        influencer.setFollowers(influencerDTO.getFollowers());
        influencer.setFollowing(influencerDTO.getFollowing());
        influencer.setProfilePicture(influencerDTO.getProfilePicture());
        influencer.setUserName(influencerDTO.getUserName());
        influencer.setPlataform(influencerDTO.getPlataform());
        Set<CategoriaEnum> categoriaEnums = new HashSet<>();

        for (String categoria : influencerDTO.getCategories()){

            CategoriaEnum categoriaEnum = CategoriaEnum.toEnum(categoria);
            categoriaEnums.add(categoriaEnum);
        }

        influencer.setCategories(categoriaEnums);

       return influencerRepository.save(influencer);
    }
}
