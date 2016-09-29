package com.yflog.entity;

import javax.persistence.*;

/**
 * Created by vincent on 9/29/16.
 */
@Entity
@Table(name = "tags", schema = "plutus")
public class Tag {
    private int id;
    private String name;
    private int type; // 0,
    private String desc;

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
    @Column(name = "name",
            nullable = false,
            unique = true,
            length = 128
    )
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(
            name = "description",
            length = 256
    )
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tag tag = (Tag) o;

        if (id != tag.id) return false;
        if (type != tag.type) return false;
        if (!name.equals(tag.name)) return false;
        return desc != null ? desc.equals(tag.desc) : tag.desc == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + type;
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        return result;
    }
}
