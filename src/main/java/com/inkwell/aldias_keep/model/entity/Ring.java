package com.inkwell.aldias_keep.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "rings")
public class Ring {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "ring_id")
    private Integer ringId;

    @Column(name = "upgrade_level")
    private Integer upgradeLevel;

    @ManyToOne
    @JoinColumn(name = "base_ring_id")
    @JsonIgnore
    private BaseRing baseRing;

    private Integer durability;

    private Double weight;

    @Column(columnDefinition="TEXT")
    private String effect;

    @Column(columnDefinition="TEXT")
    private String location;

}
