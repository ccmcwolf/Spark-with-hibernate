package com.sqldexter.organization.entity;
// Generated Mar 26, 2017 5:05:05 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Employee generated by hbm2java
 */
public class Employee  implements java.io.Serializable {


     private Integer employeeId;
     private String firstName;
     private String secondName;
     private String thirdName;
     private Date dob;
     private Date joinDate;
     private String nicNum;
     private String contactHome;
     private String contactMobile;
     private String contactOther;
     private String addHome1;
     private String addOther1;
     private Integer employeeTypeId;
     private Date employeeTypeEffDate;
     private Integer departmentId;
     private Date departmentEffDate;
     private Date resignedDate;
     private char activeStatus;
     private double basicSalary;
     private Double incentive;
     private Double attAllowance;
     private Date createdDate;
     private Date updatedDate;
     private Integer updatedUserId;
     private char deleteFlag;

    public Employee() {
    }

	
    public Employee(String firstName, String secondName, char activeStatus, double basicSalary, Date createdDate, char deleteFlag) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.activeStatus = activeStatus;
        this.basicSalary = basicSalary;
        this.createdDate = createdDate;
        this.deleteFlag = deleteFlag;
    }
    public Employee(String firstName, String secondName, String thirdName, Date dob, Date joinDate, String nicNum, String contactHome, String contactMobile, String contactOther, String addHome1, String addOther1, Integer employeeTypeId, Date employeeTypeEffDate, Integer departmentId, Date departmentEffDate, Date resignedDate, char activeStatus, double basicSalary, Double incentive, Double attAllowance, Date createdDate, Date updatedDate, Integer updatedUserId, char deleteFlag) {
       this.firstName = firstName;
       this.secondName = secondName;
       this.thirdName = thirdName;
       this.dob = dob;
       this.joinDate = joinDate;
       this.nicNum = nicNum;
       this.contactHome = contactHome;
       this.contactMobile = contactMobile;
       this.contactOther = contactOther;
       this.addHome1 = addHome1;
       this.addOther1 = addOther1;
       this.employeeTypeId = employeeTypeId;
       this.employeeTypeEffDate = employeeTypeEffDate;
       this.departmentId = departmentId;
       this.departmentEffDate = departmentEffDate;
       this.resignedDate = resignedDate;
       this.activeStatus = activeStatus;
       this.basicSalary = basicSalary;
       this.incentive = incentive;
       this.attAllowance = attAllowance;
       this.createdDate = createdDate;
       this.updatedDate = updatedDate;
       this.updatedUserId = updatedUserId;
       this.deleteFlag = deleteFlag;
    }
   
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return this.secondName;
    }
    
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getThirdName() {
        return this.thirdName;
    }
    
    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public Date getJoinDate() {
        return this.joinDate;
    }
    
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    public String getNicNum() {
        return this.nicNum;
    }
    
    public void setNicNum(String nicNum) {
        this.nicNum = nicNum;
    }
    public String getContactHome() {
        return this.contactHome;
    }
    
    public void setContactHome(String contactHome) {
        this.contactHome = contactHome;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }
    
    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }
    public String getContactOther() {
        return this.contactOther;
    }
    
    public void setContactOther(String contactOther) {
        this.contactOther = contactOther;
    }
    public String getAddHome1() {
        return this.addHome1;
    }
    
    public void setAddHome1(String addHome1) {
        this.addHome1 = addHome1;
    }
    public String getAddOther1() {
        return this.addOther1;
    }
    
    public void setAddOther1(String addOther1) {
        this.addOther1 = addOther1;
    }
    public Integer getEmployeeTypeId() {
        return this.employeeTypeId;
    }
    
    public void setEmployeeTypeId(Integer employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }
    public Date getEmployeeTypeEffDate() {
        return this.employeeTypeEffDate;
    }
    
    public void setEmployeeTypeEffDate(Date employeeTypeEffDate) {
        this.employeeTypeEffDate = employeeTypeEffDate;
    }
    public Integer getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
    public Date getDepartmentEffDate() {
        return this.departmentEffDate;
    }
    
    public void setDepartmentEffDate(Date departmentEffDate) {
        this.departmentEffDate = departmentEffDate;
    }
    public Date getResignedDate() {
        return this.resignedDate;
    }
    
    public void setResignedDate(Date resignedDate) {
        this.resignedDate = resignedDate;
    }
    public char getActiveStatus() {
        return this.activeStatus;
    }
    
    public void setActiveStatus(char activeStatus) {
        this.activeStatus = activeStatus;
    }
    public double getBasicSalary() {
        return this.basicSalary;
    }
    
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public Double getIncentive() {
        return this.incentive;
    }
    
    public void setIncentive(Double incentive) {
        this.incentive = incentive;
    }
    public Double getAttAllowance() {
        return this.attAllowance;
    }
    
    public void setAttAllowance(Double attAllowance) {
        this.attAllowance = attAllowance;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Date getUpdatedDate() {
        return this.updatedDate;
    }
    
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    public Integer getUpdatedUserId() {
        return this.updatedUserId;
    }
    
    public void setUpdatedUserId(Integer updatedUserId) {
        this.updatedUserId = updatedUserId;
    }
    public char getDeleteFlag() {
        return this.deleteFlag;
    }
    
    public void setDeleteFlag(char deleteFlag) {
        this.deleteFlag = deleteFlag;
    }




}


