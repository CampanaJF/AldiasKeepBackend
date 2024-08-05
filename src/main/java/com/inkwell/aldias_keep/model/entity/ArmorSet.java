package com.inkwell.aldias_keep.model.entity;

import com.inkwell.aldias_keep.model.enumerate.ArmorType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "armor_sets")
public class ArmorSet {

    @Id
    @Column(name = "upgrade_level")
    private Integer upgradeLevel;

    @ManyToOne
    @JoinColumn(name = "armor_id")
    private BaseArmor baseArmor;

    @Column(name = "physical_def")
    private Integer physicalDef;

    @Column(name = "strike_def")
    private Integer strikeDef;

    @Column(name = "slash_def")
    private Integer slashDef;

    @Column(name = "thrust_def")
    private Integer thrustDef;

    @Column(name = "magic_def")
    private Integer magicDef;

    @Column(name = "fire_def")
    private Integer fireDef;

    @Column(name = "lightning_def")
    private Integer lightningDef;

    @Column(name = "dark_def")
    private Integer darkDef;

    private Integer poise;

    @Column(name = "poison_resistance")
    private Integer poisonResistance;

    @Column(name = "bleed_resistance")
    private Integer bleedResistance;

    @Column(name = "petrify_resistance")
    private Integer petrifyResistance;

    @Column(name = "curse_resistance")
    private Integer curseResistance;

    @Enumerated(EnumType.STRING)
    private ArmorType armorType;

    public ArmorSet() {
    }

    public Integer getUpgradeLevel() {
        return upgradeLevel;
    }

    public void setUpgradeLevel(Integer upgradeLevel) {
        this.upgradeLevel = upgradeLevel;
    }

    public BaseArmor getBaseArmor() {
        return baseArmor;
    }

    public void setBaseArmor(BaseArmor baseArmor) {
        this.baseArmor = baseArmor;
    }

    public Integer getPhysicalDef() {
        return physicalDef;
    }

    public void setPhysicalDef(Integer physicalDef) {
        this.physicalDef = physicalDef;
    }

    public Integer getStrikeDef() {
        return strikeDef;
    }

    public void setStrikeDef(Integer strikeDef) {
        this.strikeDef = strikeDef;
    }

    public Integer getSlashDef() {
        return slashDef;
    }

    public void setSlashDef(Integer slashDef) {
        this.slashDef = slashDef;
    }

    public Integer getThrustDef() {
        return thrustDef;
    }

    public void setThrustDef(Integer thrustDef) {
        this.thrustDef = thrustDef;
    }

    public Integer getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(Integer magicDef) {
        this.magicDef = magicDef;
    }

    public Integer getFireDef() {
        return fireDef;
    }

    public void setFireDef(Integer fireDef) {
        this.fireDef = fireDef;
    }

    public Integer getLightningDef() {
        return lightningDef;
    }

    public void setLightningDef(Integer lightningDef) {
        this.lightningDef = lightningDef;
    }

    public Integer getDarkDef() {
        return darkDef;
    }

    public void setDarkDef(Integer darkDef) {
        this.darkDef = darkDef;
    }

    public Integer getPoise() {
        return poise;
    }

    public void setPoise(Integer poise) {
        this.poise = poise;
    }

    public Integer getPoisonResistance() {
        return poisonResistance;
    }

    public void setPoisonResistance(Integer poisonResistance) {
        this.poisonResistance = poisonResistance;
    }

    public Integer getBleedResistance() {
        return bleedResistance;
    }

    public void setBleedResistance(Integer bleedResistance) {
        this.bleedResistance = bleedResistance;
    }

    public Integer getPetrifyResistance() {
        return petrifyResistance;
    }

    public void setPetrifyResistance(Integer petrifyResistance) {
        this.petrifyResistance = petrifyResistance;
    }

    public Integer getCurseResistance() {
        return curseResistance;
    }

    public void setCurseResistance(Integer curseResistance) {
        this.curseResistance = curseResistance;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }
}
