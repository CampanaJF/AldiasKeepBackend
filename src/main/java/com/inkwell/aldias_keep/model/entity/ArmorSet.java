package com.inkwell.aldias_keep.model.entity;

import com.inkwell.aldias_keep.model.enumerate.ArmorType;
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

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "armor_sets")
public class ArmorSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "armor_set_id")
    private Integer armorSetId;

    @Column(name = "upgrade_level")
    private Integer upgradeLevel;

    @ManyToOne
    @JoinColumn(name = "base_armor_id")
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

}
