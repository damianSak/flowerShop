package org.melon.javacamp.onlineshop.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Products")
public class Product {

    public Product() {
    }

    @Id
    @Column(name = "Code", length = 25, nullable = false)
    private String productCode;

    @Column(name = "Name", length = 150, nullable = false)
    private String productName;

    @Column(name = "Price", nullable = false)
    private double productPrice;

    @Column(name = "Description", length = 10485760, nullable = false)
    private String productDescription;

    @Lob
    @Column(name = "Image", length = 10485760)
    private byte[] productImage;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Create_Date", nullable = false)
    private Date productCreatingDate;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public byte[] getProductImage() {
        return productImage;
    }

    public void setProductImage(byte[] productImage) {
        this.productImage = productImage;
    }

    public Date getProductCreatingDate() {
        return productCreatingDate;
    }

    public void setProductCreatingDate(Date productCreatingDate) {
        this.productCreatingDate = productCreatingDate;
    }
}
