package com.example.myapplication.Models;



/**
 * Created by Jadala on 5/4/2017.
 */
public class Metadata {
    private String name;
    private String description;
    private String dob;
    private String county;
    private String height;
    private String spouse;
    private String children;
    private String image;
    public Metadata() {
        name="";
        county="";
    }
    //Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    //  public String getCountry() {
    //      return country;
    //  }
    public void setCounty(String country) {
        this.county = county;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    /* public String getSpouse() {
         return spouse;
     }
     */
    //public void setSpouse(String spouse) {
    //  this.spouse = spouse;
    //}
    //public String getChildren() {
    // return children;
    //}
    // public void setChildren(String children) {
    //  this.children = children;
    // }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

}
