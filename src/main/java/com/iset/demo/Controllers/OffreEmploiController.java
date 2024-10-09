package com.iset.demo.Controllers;

import com.iset.demo.Entity.Offre;
import com.iset.demo.Repositories.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Offres")
public class OffreEmploiController {
        @Autowired
        OffreRepository offreRepository;
        @GetMapping
        public List<Offre> getAll() {
            return offreRepository.findAll();
        }

    @GetMapping("/{uid}")
    public Offre getbyid(@PathVariable Long uid ) {

        return offreRepository.findById(uid).get();
    }
    @PostMapping("/add")
    public Offre saveoffre(@RequestBody Offre newoffre) {
        return offreRepository.save(newoffre);
    }
    @DeleteMapping("/{id}")
    public String deleteoffre(@PathVariable Long id) {
        offreRepository.deleteById(id);
        return "offre is delete ";
    }



}

