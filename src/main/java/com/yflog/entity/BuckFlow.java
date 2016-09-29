package com.yflog.entity;

import javax.persistence.*;

/**
 * Created by vincent on 9/29/16.
 */
@Entity
@Table(name = "buck_flows", schema = "plutus")
public class BuckFlow {
    private int id;
    private int flowType;
    private long amount;
    private Bucket fromBucket;
    private Bucket toBucket;
    private String desc;
    private Role role;

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
    @Column(name = "flowType")
    public int getFlowType() {
        return flowType;
    }

    public void setFlowType(int flowType) {
        this.flowType = flowType;
    }

    @Basic
    @Column(name = "amount")
    public long getAmount() {
        return amount;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    public Bucket getFromBucket() {
        return fromBucket;
    }

    public void setFromBucket(Bucket fromBucket) {
        this.fromBucket = fromBucket;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Bucket getToBucket() {
        return toBucket;
    }

    public void setToBucket(Bucket toBucket) {
        this.toBucket = toBucket;
    }

    @Column(name = "description", length = 256)
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuckFlow that = (BuckFlow) o;

        if (id != that.id) return false;
        if (flowType != that.flowType) return false;
        if (amount != that.amount) return false;
        if (!fromBucket.equals(that.fromBucket)) return false;
        if (!toBucket.equals(that.toBucket)) return false;
        return desc != null ? desc.equals(that.desc) : that.desc == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + flowType;
        result = 31 * result + (int) (amount ^ (amount >>> 32));
        result = 31 * result + fromBucket.hashCode();
        result = 31 * result + toBucket.hashCode();
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BucketFlow{" +
                "id=" + id +
                ", flowType=" + flowType +
                ", amount=" + amount +
                ", fromBucket=" + fromBucket +
                ", toBucket=" + toBucket +
                ", desc='" + desc + '\'' +
                '}';
    }
}
