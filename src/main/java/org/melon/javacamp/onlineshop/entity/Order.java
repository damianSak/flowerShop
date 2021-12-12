package org.melon.javacamp.onlineshop.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Order {

    @Id
    @Column(name ="ID", length =50)
    private String id;

    @Column (name = "Order_Date", nullable = false)
    private Date orderDate;

    @Column (name ="Order_Number", nullable = false)
    private int orderNumber;

    @Column (name = "Amount", nullable = false)
    private int amount;

    @Column(name ="Customer_Name", length = 255, nullable = false)
    private String customerName;

    @Column (name ="Customer_Adress", length = 128, nullable = false)
    private String CustomerAdress;

    @Column (name ="Customer_Email", length = 128, nullable = false)
    private String CustomerEmail;

    @Column (name ="Customer_Phone", length = 128, nullable = false)
    private String CustomerPhone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAdress() {
        return CustomerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        CustomerAdress = customerAdress;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        CustomerPhone = customerPhone;
    }
}
