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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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

}
