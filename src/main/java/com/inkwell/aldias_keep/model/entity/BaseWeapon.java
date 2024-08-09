package com.inkwell.aldias_keep.model.entity;

import com.inkwell.aldias_keep.model.enumerate.AttackType;
import com.inkwell.aldias_keep.model.enumerate.WeaponCategory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "base_weapons")
public class BaseWeapon extends Equipment {

    @Id
    @Column(name = "base_weapon_id")
    private Integer id;

    @OneToMany(mappedBy = "baseWeapon")
    private List<Weapon> weapons = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(name = "weapon_category")
    private WeaponCategory weaponCategory;

    @Enumerated(EnumType.STRING)
    @Column(name = "attack_type")
    private AttackType attackType;

    @Column(name = "counter_strength")
    private Integer counterStrength;

    @Column(name = "poise_damage")
    private Integer poiseDamage;

    @Column(name = "shot_range")
    private Integer shotRange;

    @Column(name = "cast_speed")
    private Integer castSpeed;

    private Integer stability;

}
