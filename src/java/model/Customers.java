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
public class Customers {

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    private   String un;
    private   String pass;
    private  String admin;
    
    private  String email;
    private  String hoten;

    public Customers() {

    }

    public Customers(String un, String pass, String hoten,  String email, String admin) {
        this.un = un;
        this.pass = pass;
        this.hoten = hoten;
        this.email = email;
        this.admin = admin;
    }
        public Customers(String un, String pass, String admin) {
        this.un = un;
        this.pass = pass;
        this.admin = admin;
    }
}
