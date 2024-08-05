package com.inkwell.aldias_keep.model.entity;

import java.io.Serializable;
import java.util.Objects;


public class EquipmentId implements Serializable {

    private Integer id;

    private Integer upgradeLevel;

    public EquipmentId( ) {

    }

    public EquipmentId(Integer id, Integer upgradeLevel) {
        this.id = id;
        this.upgradeLevel = upgradeLevel;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EquipmentId that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(upgradeLevel, that.upgradeLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, upgradeLevel);
    }
}
