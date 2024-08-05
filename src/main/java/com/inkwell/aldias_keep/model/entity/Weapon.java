package com.inkwell.aldias_keep.model.entity;

import com.inkwell.aldias_keep.model.enumerate.AttackType;
import com.inkwell.aldias_keep.model.enumerate.ScalingGrade;
import com.inkwell.aldias_keep.model.enumerate.WeaponCategory;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "weapons")
@IdClass(EquipmentId.class)
public class Weapon extends Equipment{

    @Id
    private Integer id;

    @Id
    private Integer upgradeLevel;

    @Enumerated(EnumType.STRING)
    private WeaponCategory weaponCategory;

    @Enumerated(EnumType.STRING)
    private AttackType attackType;

    private Integer physicalAtk;

    private Integer magicAtk;

    private Integer fireAtk;

    private Integer lightningAtk;

    private Integer darkAtk;

    private Integer poisonEffect;

    private Integer bleedEffect;

    private Integer counterStrength;

    private Integer poiseDamage;

    private Integer shotRange;

    private Integer castSpeed;

    private Integer physicalReduction;

    private Integer magicReduction;

    private Integer fireReduction;

    private Integer lightningReduction;

    private Integer darkReduction;

    private Integer poisonReduction;

    private Integer bleedReduction;

    private Integer petrifyReduction;

    private Integer curseReduction;

    private Integer stability;

    @Enumerated(EnumType.STRING)
    private ScalingGrade strengthBonus;

    @Enumerated(EnumType.STRING)
    private ScalingGrade dexterityBonus;

    @Enumerated(EnumType.STRING)
    private ScalingGrade magicBonus;

    @Enumerated(EnumType.STRING)
    private ScalingGrade fireBonus;

    @Enumerated(EnumType.STRING)
    private ScalingGrade lightningBonus;

    @Enumerated(EnumType.STRING)
    private ScalingGrade darkBonus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUpgradeLevel() {
        return upgradeLevel;
    }

    public void setUpgradeLevel(Integer upgradeLevel) {
        this.upgradeLevel = upgradeLevel;
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

    public Integer getStability() {
        return stability;
    }

    public void setStability(Integer stability) {
        this.stability = stability;
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
