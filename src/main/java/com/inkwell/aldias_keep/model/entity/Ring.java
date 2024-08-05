package com.inkwell.aldias_keep.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "rings")
public class Ring {

    @Id
    @Column(name = "upgrade_level")
    private Integer upgradeLevel;

    @ManyToOne
    @JoinColumn(name = "ring_id")
    private BaseRing baseRing;

    private String name;

    private Integer durability;

    private String description;

    private Double weight;

    private String effect;

    public Ring() {
    }

    public Integer getUpgradeLevel() {
        return upgradeLevel;
    }

    public void setUpgradeLevel(Integer upgradeLevel) {
        this.upgradeLevel = upgradeLevel;
    }

    public BaseRing getBaseRing() {
        return baseRing;
    }

    public void setBaseRing(BaseRing baseRing) {
        this.baseRing = baseRing;
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
