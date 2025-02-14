package org.example.app_coiffure.service;

import org.example.app_coiffure.model.Coiffeur;
import org.example.app_coiffure.repository.CoiffeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoiffeurService {

    @Autowired
    private CoiffeurRepository coiffeurRepository;

    public List<Coiffeur> getAllCoiffeurs() {
        return coiffeurRepository.findAll();
    }

    public Coiffeur getCoiffeurById(int id) {
        return coiffeurRepository.findById(id).orElse(null);
    }
}
