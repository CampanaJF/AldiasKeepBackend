package com.inkwell.aldias_keep.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "base_rings")
public class BaseRing {

    @Id
    @Column(name = "base_ring_id")
    private Integer id;

    private String name;

    @Column(columnDefinition="TEXT")
    private String description;

    private String img;

    @OneToMany(mappedBy = "baseRing")
    private List<Ring> rings = new ArrayList<>();

}
