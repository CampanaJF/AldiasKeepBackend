package com.inkwell.aldias_keep.model.entity;

import com.inkwell.aldias_keep.model.enumerate.ScalingGrade;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "weapons")
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "weapon_id")
    private Integer weaponId;

    @Column(name = "upgrade_level")
    private Integer upgradeLevel;

    @ManyToOne
    @JoinColumn(name = "base_weapon_id")
    private BaseWeapon baseWeapon;

    @Column(name = "physical_atk")
    private Integer physicalAtk;

    @Column(name = "magic_atk")
    private Integer magicAtk;

    @Column(name = "fire_atk")
    private Integer fireAtk;

    @Column(name = "lightning_atk")
    private Integer lightningAtk;

    @Column(name = "dark_atk")
    private Integer darkAtk;

    @Column(name = "poison_effect")
    private Integer poisonEffect;

    @Column(name = "bleed_effect")
    private Integer bleedEffect;

    @Column(name = "physical_reduction")
    private Integer physicalReduction;

    @Column(name = "magic_reduction")
    private Integer magicReduction;

    @Column(name = "fire_reduction")
    private Integer fireReduction;

    @Column(name = "lightning_reduction")
    private Integer lightningReduction;

    @Column(name = "dark_reduction")
    private Integer darkReduction;

    @Column(name = "poison_reduction")
    private Integer poisonReduction;

    @Column(name = "bleed_reduction")
    private Integer bleedReduction;

    @Column(name = "petrify_reduction")
    private Integer petrifyReduction;

    @Column(name = "curse_reduction")
    private Integer curseReduction;

    @Enumerated(EnumType.STRING)
    @Column(name = "strength_bonus")
    private ScalingGrade strengthBonus;

    @Enumerated(EnumType.STRING)
    @Column(name = "dexterity_bonus")
    private ScalingGrade dexterityBonus;

    @Enumerated(EnumType.STRING)
    @Column(name = "magic_bonus")
    private ScalingGrade magicBonus;

    @Enumerated(EnumType.STRING)
    @Column(name = "fire_bonus")
    private ScalingGrade fireBonus;

    @Enumerated(EnumType.STRING)
    @Column(name = "lightning_bonus")
    private ScalingGrade lightningBonus;

    @Enumerated(EnumType.STRING)
    @Column(name = "dark_bonus")
    private ScalingGrade darkBonus;

    public Integer getUpgradeLevel() {
        return upgradeLevel;
    }

    public void setUpgradeLevel(Integer upgradeLevel) {
        this.upgradeLevel = upgradeLevel;
    }

    public BaseWeapon getBaseWeapon() {
        return baseWeapon;
    }

    public void setBaseWeapon(BaseWeapon baseWeapon) {
        this.baseWeapon = baseWeapon;
    }

    public Integer getPhysicalAtk() {
        return physicalAtk;
    }

    public void setPhysicalAtk(Integer physicalAtk) {
        this.physicalAtk = physicalAtk;
    }

    public Integer getMagicAtk() {
        return magicAtk;
    }

    public void setMagicAtk(Integer magicAtk) {
        this.magicAtk = magicAtk;
    }

    public Integer getFireAtk() {
        return fireAtk;
    }

    public void setFireAtk(Integer fireAtk) {
        this.fireAtk = fireAtk;
    }

    public Integer getLightningAtk() {
        return lightningAtk;
    }

    public void setLightningAtk(Integer lightningAtk) {
        this.lightningAtk = lightningAtk;
    }

    public Integer getDarkAtk() {
        return darkAtk;
    }

    public void setDarkAtk(Integer darkAtk) {
        this.darkAtk = darkAtk;
    }

    public Integer getPoisonEffect() {
        return poisonEffect;
    }

    public void setPoisonEffect(Integer poisonEffect) {
        this.poisonEffect = poisonEffect;
    }

    public Integer getBleedEffect() {
        return bleedEffect;
    }

    public void setBleedEffect(Integer bleedEffect) {
        this.bleedEffect = bleedEffect;
    }

    public Integer getPhysicalReduction() {
        return physicalReduction;
    }

    public void setPhysicalReduction(Integer physicalReduction) {
        this.physicalReduction = physicalReduction;
    }

    public Integer getMagicReduction() {
        return magicReduction;
    }

    public void setMagicReduction(Integer magicReduction) {
        this.magicReduction = magicReduction;
    }

    public Integer getFireReduction() {
        return fireReduction;
    }

    public void setFireReduction(Integer fireReduction) {
        this.fireReduction = fireReduction;
    }

    public Integer getLightningReduction() {
        return lightningReduction;
    }

    public void setLightningReduction(Integer lightningReduction) {
        this.lightningReduction = lightningReduction;
    }

    public Integer getDarkReduction() {
        return darkReduction;
    }

    public void setDarkReduction(Integer darkReduction) {
        this.darkReduction = darkReduction;
    }

    public Integer getPoisonReduction() {
        return poisonReduction;
    }

    public void setPoisonReduction(Integer poisonReduction) {
        this.poisonReduction = poisonReduction;
    }

    public Integer getBleedReduction() {
        return bleedReduction;
    }

    public void setBleedReduction(Integer bleedReduction) {
        this.bleedReduction = bleedReduction;
    }

    public Integer getPetrifyReduction() {
        return petrifyReduction;
    }

    public void setPetrifyReduction(Integer petrifyReduction) {
        this.petrifyReduction = petrifyReduction;
    }

    public Integer getCurseReduction() {
        return curseReduction;
    }

    public void setCurseReduction(Integer curseReduction) {
        this.curseReduction = curseReduction;
    }

    public ScalingGrade getStrengthBonus() {
        return strengthBonus;
    }

    public void setStrengthBonus(ScalingGrade strengthBonus) {
        this.strengthBonus = strengthBonus;
    }

    public ScalingGrade getDexterityBonus() {
        return dexterityBonus;
    }

    public void setDexterityBonus(ScalingGrade dexterityBonus) {
        this.dexterityBonus = dexterityBonus;
    }

    public ScalingGrade getMagicBonus() {
        return magicBonus;
    }

    public void setMagicBonus(ScalingGrade magicBonus) {
        this.magicBonus = magicBonus;
    }

    public ScalingGrade getFireBonus() {
        return fireBonus;
    }

    public void setFireBonus(ScalingGrade fireBonus) {
        this.fireBonus = fireBonus;
    }

    public ScalingGrade getLightningBonus() {
        return lightningBonus;
    }

    public void setLightningBonus(ScalingGrade lightningBonus) {
        this.lightningBonus = lightningBonus;
    }

    public ScalingGrade getDarkBonus() {
        return darkBonus;
    }

    public void setDarkBonus(ScalingGrade darkBonus) {
        this.darkBonus = darkBonus;
    }
}
