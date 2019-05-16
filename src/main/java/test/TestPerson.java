/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.PersonInChargeDao;
import models.PersonInCharge;

/**
 *
 * @author asus
 */
public class TestPerson {
    public static void main (String []args){
        
    boolean inserted = PersonInChargeDao.add(
    
            new PersonInCharge("Karen Paola", "Lopez Javier", "Madre", "4753-4895")
    );
    
        System.out.println(inserted);
    
    }
    
    
}
