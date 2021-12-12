package org.melon.javacamp.onlineshop.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EmployeesAccounts")
public class EmployeeAccount {

    public static final String ROLE_MANAGER = "MANAGER";
    public static final String ROLE_EMPLOYEE = "EMPLOYEE";

    public EmployeeAccount() {

    }

    @Id
    @Column(name = "Employee_Name", length = 25, nullable = false)
    private String employeeName;

    @Column(name = "Employee_Surname", length = 40, nullable = false)
    private String emplyeeSurname;

    @Column(name = "Encrypted_password", length = 30, nullable = false)
    private String encryptedPassword;

    @Column(name = "Position", length = 25, nullable = false)
    private String empolyeePosition;

    @Column(name = "Active", nullable = false)
    private boolean isActive;

    @Column(name = "Email", length = 50, nullable = false)
    private String employeeEmail;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Creation_Date")
    private Date accountCreationDate;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmplyeeSurname() {
        return emplyeeSurname;
    }

    public void setEmplyeeSurname(String emplyeeSurname) {
        this.emplyeeSurname = emplyeeSurname;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getEmpolyeePosition() {
        return empolyeePosition;
    }

    public void setEmpolyeePosition(String empolyeePosition) {
        this.empolyeePosition = empolyeePosition;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public Date getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(Date accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }
}

