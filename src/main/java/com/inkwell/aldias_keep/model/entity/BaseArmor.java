package com.inkwell.aldias_keep.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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

}
