/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import java.io.Serializable;
import model.Product;

/**
 *
 * @author Nizis
 */
public class ProductDTO implements Serializable {

    public Product getSanpham() {
        return sanpham;
    }

    public void setSanpham(Product sanpham) {
        this.sanpham = sanpham;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private Product sanpham;
    private int quantity;
    public ProductDTO(){}
    public ProductDTO(Product sp){
    this.sanpham=sp;
    this.quantity=1;
    }
}
