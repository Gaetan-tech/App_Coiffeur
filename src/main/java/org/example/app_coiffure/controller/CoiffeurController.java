package org.example.app_coiffure.controller;

import org.example.app_coiffure.model.Coiffeur;
import org.example.app_coiffure.service.CoiffeurService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coiffeurs")
public class CoiffeurController {

    @Autowired
    private CoiffeurService coiffeurService;

    @GetMapping("/all")
    public ResponseEntity<List<Coiffeur>> getAllCoiffeurs() {
        List<Coiffeur> coiffeurs = coiffeurService.getAllCoiffeurs();
        return new ResponseEntity<>(coiffeurs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coiffeur> getCoiffeurById(@PathVariable int id) {
        Coiffeur coiffeur = coiffeurService.getCoiffeurById(id);
        if (coiffeur != null) {
            return new ResponseEntity<>(coiffeur, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}