package org.example.app_coiffure.repository;

import org.example.app_coiffure.model.Coiffeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoiffeurRepository extends JpaRepository<Coiffeur, Integer> {

}
