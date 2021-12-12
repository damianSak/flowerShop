package org.melon.javacamp.onlineshop.form;

import org.melon.javacamp.onlineshop.entity.Product;
import org.springframework.web.multipart.MultipartFile;

public class ProductForm {
    private String code;
    private String name;
    private double price;

    private boolean newProduct = false;

    // Upload file.
    private MultipartFile fileData;

    public ProductForm() {
        this.newProduct= true;
    }

    public ProductForm(Product product) {
        this.code = product.getProductCode();
        this.name = product.getProductName();
        this.price = product.getProductPrice();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MultipartFile getFileData() {
        return fileData;
    }

    public void setFileData(MultipartFile fileData) {
        this.fileData = fileData;
    }

    public boolean isNewProduct() {
        return newProduct;
    }

    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }
}
