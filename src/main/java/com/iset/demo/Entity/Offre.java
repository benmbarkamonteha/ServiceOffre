package com.iset.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Offre {
    @Id
    @GeneratedValue
    long code;
    String intitulé;
    String specialité;
    String société;
    int nbpostes;
    String pays;

    public Offre(String intitulé,String specialité,String société ,int nbpostes,String pays ){
        this.intitulé=intitulé;
        this.specialité=specialité;
        this.société=société;
        this.nbpostes=nbpostes;
        this.pays=pays;
    }


}

