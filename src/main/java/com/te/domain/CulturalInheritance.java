package com.te.domain;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name="cultural_inheritances")
public class CulturalInheritance {

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "culturalInheritance_id_seq")
    @SequenceGenerator(name="culturalInheritance_id_seq", sequenceName = "culturalInheritance_id_seq", allocationSize = 1)
    public Long id;

    @Column(name="category")
    public String category;

    @Column(name="museum")
    public String museum;

    @Column(name="historical_scene")
    public String historicalScene;

    public Long getId(){
        return this.id;
    }

    public String getCategory(){
        return this.category;
    }
    public void setCategory(String category){
        this.category=category;
    }

    public String getMuseum(){
        return this.museum;
    }
    public void setMuseum(String museum){
        this.museum=museum;
    }

    public String getHistoricalScene(){
        return this.historicalScene;
    }
    public void setHistoricalScene(String historicalScene){
        this.museum=museum;
    }
}
