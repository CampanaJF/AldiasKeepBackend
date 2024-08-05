package com.inkwell.aldias_keep.model.entity;

import java.io.Serializable;
import java.util.Objects;


public class EquipmentId implements Serializable {

    private Integer id;

    private Integer upgrade;

    public EquipmentId( ) {

    }

    public EquipmentId(Integer id, Integer upgrade) {
        this.id = id;
        this.upgrade = upgrade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(Integer upgrade) {
        this.upgrade = upgrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EquipmentId that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(upgrade, that.upgrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, upgrade);
    }
}
