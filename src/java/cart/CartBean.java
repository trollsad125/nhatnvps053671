/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import java.util.HashMap;

/**
 *
 * @author Nizis
 */
public class CartBean extends HashMap {
    public void addSanPham(ProductDTO sp){
        String key= sp.getSanpham().getCode();
        if(this.containsKey(key)){
            int oldQuantity = ((ProductDTO)this.get(key)).getQuantity();
            ((ProductDTO)this.get(key)).setQuantity(oldQuantity+1);
        }else{
            this.put(sp.getSanpham().getCode(), sp);
        }
    }
     
    public boolean removeSanpham(String code){
        if(this.containsKey(code)){
            this.remove(code);
            return true;
        }
        return false;
    }
     public void updateSP(String code, int t) {
        if(t==0)
          removeSanpham(code);
        else ((ProductDTO) this.get(code)).setQuantity(t);
        
    }
    public CartBean(){
        super();
    }
}
