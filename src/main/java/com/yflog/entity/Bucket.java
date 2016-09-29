package com.yflog.entity;

import javax.persistence.*;

/**
 * Created by vincent on 9/29/16.
 */
@Entity
@Table(name = "buckets", schema = "plutus")
public class Bucket {
    private int id;
    private String name;
    private long balance; // in cent 1yuan = 100cent
    private String desc;

    @Id
    @Column(name = "id",
            nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column (name = "name", nullable = false, unique = true, length = 128)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "balance")
    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "description", length = 256)
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bucket bucket = (Bucket) o;

        if (id != bucket.id) return false;
        if (balance != bucket.balance) return false;
        if (!name.equals(bucket.name)) return false;
        return desc != null ? desc.equals(bucket.desc) : bucket.desc == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + (int) (balance ^ (balance >>> 32));
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", desc='" + desc + '\'' +
                '}';
    }
}
