package com.inkwell.aldias_keep.model.entity;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Equipment {

    private String name;

    private Integer durability;

    private String description;

    private Double weight;

    private String effect;

    private Integer strengthRequirement;

    private Integer dexterityRequirement;

    private Integer intelligenceRequirement;

    private Integer faithRequirement;

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

    public Integer getStrengthRequirement() {
        return strengthRequirement;
    }

    public void setStrengthRequirement(Integer strengthRequirement) {
        this.strengthRequirement = strengthRequirement;
    }

    public Integer getDexterityRequirement() {
        return dexterityRequirement;
    }

    public void setDexterityRequirement(Integer dexterityRequirement) {
        this.dexterityRequirement = dexterityRequirement;
    }

    public Integer getIntelligenceRequirement() {
        return intelligenceRequirement;
    }

    public void setIntelligenceRequirement(Integer intelligenceRequirement) {
        this.intelligenceRequirement = intelligenceRequirement;
    }

    public Integer getFaithRequirement() {
        return faithRequirement;
    }

    public void setFaithRequirement(Integer faithRequirement) {
        this.faithRequirement = faithRequirement;
    }
}
