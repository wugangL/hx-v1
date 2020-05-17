package com.hxv1.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * product
 * @author 
 */
public class Product implements Serializable {
    /**
     * 商品id
     */
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品图片
     */
    private String image;

    /**
     * 商品价格
     */
    private Long salePrice;

    /**
     * 原价
     */
    private Long price;

    /**
     * 卖点
     */
    private String salePoint;

    /**
     * 修改者
     */
    private Long updateUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建者
     */
    private Long createUser;

    /**
     * 是否上架
     */
    private Boolean flag;

    private String typename;

    /**
     * 商品类型id
     */
    private Long typeId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getSalePoint() {
        return salePoint;
    }

    public void setSalePoint(String salePoint) {
        this.salePoint = salePoint;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(image, product.image) &&
                Objects.equals(salePrice, product.salePrice) &&
                Objects.equals(price, product.price) &&
                Objects.equals(salePoint, product.salePoint) &&
                Objects.equals(updateUser, product.updateUser) &&
                Objects.equals(createTime, product.createTime) &&
                Objects.equals(updateTime, product.updateTime) &&
                Objects.equals(createUser, product.createUser) &&
                Objects.equals(flag, product.flag) &&
                Objects.equals(typename, product.typename) &&
                Objects.equals(typeId, product.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, image, salePrice, price, salePoint, updateUser, createTime, updateTime, createUser, flag, typename, typeId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", salePrice=" + salePrice +
                ", price=" + price +
                ", salePoint='" + salePoint + '\'' +
                ", updateUser=" + updateUser +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createUser=" + createUser +
                ", flag=" + flag +
                ", typename='" + typename + '\'' +
                ", typeId=" + typeId +
                '}';
    }
}