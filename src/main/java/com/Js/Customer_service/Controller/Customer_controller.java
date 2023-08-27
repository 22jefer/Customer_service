/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Customer_service.Controller;

import com.Js.Customer_service.BillBLL.Response_bill;
import com.Js.Customer_service.Entity.Customer;
import com.Js.Customer_service.Service.Customer_service;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */

@RestController
@RequestMapping("/api/customer")
@AllArgsConstructor
@Data
public class Customer_controller {
    
    public final Customer_service customer_service;
    
    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer){
        return customer_service.saveCustomer(customer);
    }
    
    @GetMapping("/response/{id}")
    public Response_bill response_bill(@PathVariable Integer id){
        return customer_service.response(id);
    }
    
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Integer id){
        return customer_service.getCustomerById(id);
    }
    
    @GetMapping
    public List<Customer> AllCustomer(){
        return customer_service.AllCustomer();
    }
    
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        return customer_service.updateCustomer(customer);
    }
    
    @DeleteMapping
    public void deleteCustomer(@RequestBody Customer customer){
        customer_service.deleteCustomer(customer);
    }
 
    @DeleteMapping("/{id}")
    public void deletedCustomerById(@PathVariable Integer id){
        customer_service.deleteCustomerById(id);
      
    }  
}
