/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opiframe.DAO;

import com.opiframe.models.Products;
import java.util.ArrayList;
import java.util.List;


public class ProductsDAO {

    private static List<Products> prods = new ArrayList();
    
    public static List<Products> getProducts(){
        
        Products prod1 = new Products();
        prod1.setHinta(12.5d);
        prod1.setMaara(10);
        prod1.setId(2345);
        prod1.setNimi("Joulukinkku");
      
        Products prod2 = new Products();
        prod2.setHinta(25.5d);
        prod2.setMaara(20);
        prod2.setId(2346);
        prod2.setNimi("Glögi");
        
        
        prods.add(prod1);
        prods.add(prod2);
        
        return prods;
    }
    
}
