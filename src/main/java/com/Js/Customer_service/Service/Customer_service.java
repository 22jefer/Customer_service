/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Customer_service.Service;

import com.Js.Customer_service.Entity.Customer;
import com.Js.Customer_service.Repository.Customer_repository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */

@AllArgsConstructor
@Service
public class Customer_service {
    
    private final Customer_repository customer_repository;
    
    public Customer saveCustomer(Customer customer){
        return customer_repository.save(customer);
    }
    
    public Customer getCustomerById(Integer id){
        return customer_repository.findById(id).get();
    }
    
    public List<Customer> AllCustomer(){
        return customer_repository.findAll();
    } 
    
    public Customer updateCustomer(Customer customer){
        return customer_repository.save(customer);
    }
    
    public void deleteCustomer(Customer customer){
        customer_repository.delete(customer);
        
    }
    
    public void deleteCustomerById(Integer id){
        customer_repository.deleteById(id);   
    }
    
    
}
