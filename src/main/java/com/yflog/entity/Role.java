package com.yflog.entity;

import javax.persistence.*;

/**
 * Created by vincent on 9/29/16.
 */
@Entity
@Table(name="roles", schema = "plutus")
public class Role {
    private int id;
    private String roleName;
    private String description;
    private int type;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name="roleName", unique = true, nullable = false)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "description", length = 512)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (id != role.id) return false;
        if (type != role.type) return false;
        if (!roleName.equals(role.roleName)) return false;
        return description != null ? description.equals(role.description) : role.description == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + roleName.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + type;
        return result;
    }
}
