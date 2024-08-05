package com.inkwell.aldias_keep.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rings")
public class Ring {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ringId;

    private String name;

    private Integer durability;

    private String description;

    private Double weight;

    private String effect;

    public Integer getRingId() {
        return ringId;
    }

    public void setRingId(Integer ringId) {
        this.ringId = ringId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDurability() {
        return durability;
    }

    public void setDurability(Integer durability) {
        this.durability = durability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
}
