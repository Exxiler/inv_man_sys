package com.inv_man_sys.inv_man_sys.Entity;

import java.util.Date;

public class Invoice {

    private String customer_name;
    private Date issue_date;
    private Date due_date;
    private String item_name;
    private String comment;
    private double price;

    private Invoice() {

    }

    public Invoice(String customer_name, Date issue_date, Date due_date, String item_name, String comment, double price) {
        this.customer_name = customer_name;
        this.issue_date = issue_date;
        this.due_date = due_date;
        this.item_name = item_name;
        this.comment = comment;
        this.price = price;
    }

    public Invoice(String customer_name, Date due_date, String item_name, String comment, double price) {
        this.customer_name = customer_name;
        this.issue_date = new Date();
        this.due_date = due_date;
        this.item_name = item_name;
        this.comment = comment;
        this.price = price;
    }


    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Date getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(Date issue_date) {
        this.issue_date = issue_date;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

}
