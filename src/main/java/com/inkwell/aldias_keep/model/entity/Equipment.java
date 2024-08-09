package com.inkwell.aldias_keep.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Equipment {

    private String name;

    private Integer durability;

    @Column(columnDefinition="TEXT")
    private String description;

    private Double weight;

    @Column(columnDefinition="TEXT")
    private String effect;

    private String img;

    private Integer strengthRequirement;

    private Integer dexterityRequirement;

    private Integer intelligenceRequirement;

    private Integer faithRequirement;

}
