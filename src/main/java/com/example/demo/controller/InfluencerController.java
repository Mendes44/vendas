package com.example.demo.controller;

import com.example.demo.model.Influencer;
import com.example.demo.model.dto.InfluencerDTO;
import com.example.demo.service.InfluencerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/influencers")
public class InfluencerController {

    @Autowired
    private InfluencerService influencerService;

    //Criando um recurso para retornar a lista de Influencers
    @GetMapping
    public List<Influencer> getAll(){

        return influencerService.getAllInfluencer();
    }

    //Criando recurso para salvar influencer
    @PostMapping
    public ResponseEntity <Influencer> save (@RequestBody InfluencerDTO influencer){
        Influencer response = influencerService.saveInfluencer(influencer);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
