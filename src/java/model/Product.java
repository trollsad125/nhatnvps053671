/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nizis
 */
public class Product {

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    private String code;
    private String name;
    private float price;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    private String image;
   
   
    public Product(String code,String name,float price,String image){
        this.code=code;
        this.name=name;
        this.price=price;
       this.image=image;
    }
     public Product(String code,String name,float price){
        this.code=code;
        this.name=name;
        this.price=price;
     }
    public Product(){}
    
}
