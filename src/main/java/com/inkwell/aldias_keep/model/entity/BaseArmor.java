package com.inkwell.aldias_keep.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "base_armor")
public class BaseArmor extends Equipment {

    @Id
    @Column(name = "base_armor_id")
    private Integer id;

    @OneToMany(mappedBy = "baseArmor")
    private List<Armor> armor = new ArrayList<>();

    @OneToMany(mappedBy = "baseArmor")
    private List<ArmorSet> armorSets = new ArrayList<>();

    private Integer poise;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Armor> getArmor() {
        return armor;
    }

    public void setArmor(List<Armor> armor) {
        this.armor = armor;
    }

    public List<ArmorSet> getArmorSets() {
        return armorSets;
    }

    public void setArmorSets(List<ArmorSet> armorSets) {
        this.armorSets = armorSets;
    }

    public Integer getPoise() {
        return poise;
    }

    public void setPoise(Integer poise) {
        this.poise = poise;
    }
}
