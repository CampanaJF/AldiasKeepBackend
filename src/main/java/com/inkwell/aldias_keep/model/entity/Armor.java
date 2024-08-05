package com.inkwell.aldias_keep.model.entity;

import com.inkwell.aldias_keep.model.enumerate.EquipmentSlot;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "armors")
@IdClass(EquipmentId.class)
public class Armor extends Equipment {

    @Id
    private Integer id;

    @Id
    private Integer upgradeLevel;

    private Integer physicalDef;

    private Integer strikeDef;

    private Integer slashDef;

    private Integer thrustDef;

    private Integer magicDef;

    private Integer fireDef;

    private Integer lightningDef;

    private Integer darkDef;

    private Integer poise;

    private Integer poisonResistance;

    private Integer bleedResistance;

    private Integer petrifyResistance;

    private Integer curseResistance;

    private Integer attributeBonusPhysicalDefence;

    @Enumerated(EnumType.STRING)
    private EquipmentSlot equipmentSlot;

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

    public Integer getAttributeBonusPhysicalDefence() {
        return attributeBonusPhysicalDefence;
    }

    public void setAttributeBonusPhysicalDefence(Integer attributeBonusPhysicalDefence) {
        this.attributeBonusPhysicalDefence = attributeBonusPhysicalDefence;
    }

    public EquipmentSlot getEquipmentSlot() {
        return equipmentSlot;
    }

    public void setEquipmentSlot(EquipmentSlot equipmentSlot) {
        this.equipmentSlot = equipmentSlot;
    }
}
