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

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "base_weapons")
public class BaseWeapon extends Equipment {

    @Id
    @Column(name = "weapon_id")
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WeaponCategory getWeaponCategory() {
        return weaponCategory;
    }

    public void setWeaponCategory(WeaponCategory weaponCategory) {
        this.weaponCategory = weaponCategory;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public Integer getCounterStrength() {
        return counterStrength;
    }

    public void setCounterStrength(Integer counterStrength) {
        this.counterStrength = counterStrength;
    }

    public Integer getPoiseDamage() {
        return poiseDamage;
    }

    public void setPoiseDamage(Integer poiseDamage) {
        this.poiseDamage = poiseDamage;
    }

    public Integer getShotRange() {
        return shotRange;
    }

    public void setShotRange(Integer shotRange) {
        this.shotRange = shotRange;
    }

    public Integer getCastSpeed() {
        return castSpeed;
    }

    public void setCastSpeed(Integer castSpeed) {
        this.castSpeed = castSpeed;
    }

    public Integer getStability() {
        return stability;
    }

    public void setStability(Integer stability) {
        this.stability = stability;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }
}
