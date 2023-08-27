/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Customer_service.Service;

import com.Js.Customer_service.BillBLL.Bill;
import com.Js.Customer_service.BillBLL.Product;
import com.Js.Customer_service.BillBLL.Response_bill;
import com.Js.Customer_service.BillBLL.Supplier;
import com.Js.Customer_service.Entity.Customer;
import com.Js.Customer_service.Repository.Customer_repository;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Asus
 */

@AllArgsConstructor
@Service
@Data
public class Customer_service {
    
    private final Customer_repository customer_repository;
    
    private final RestTemplate restTemplate;
    
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
    
    public Bill response_bill(Integer id){
        
        Customer customer = customer_repository.findById(id).get();
        
        ResponseEntity<Bill> responseEntity = restTemplate.getForEntity(
                "http://localhost:8083/api/bill/"+customer.getBill_id(),
                Bill.class);
        
        Bill bill = responseEntity.getBody();
                
        return bill;
    }
    
    public Product response_product (Integer id){

        Customer customer = customer_repository.findById(id).get();

        ResponseEntity<Product> responseEntity = restTemplate.getForEntity(
                "http://localhost:8082/api/product/"+customer.getProductId(),
                Product.class);

        Product product = responseEntity.getBody();

        return product;
        
    }
    
    public Supplier response_supplier(Integer id){

        Customer customer = customer_repository.findById(id).get();
        
        ResponseEntity<Supplier> responseEntity = restTemplate.getForEntity(
                "http://localhost:8081/api/supplier/"+customer.getSupplierId(),
                Supplier.class);
        
        Supplier supplier = responseEntity.getBody();
        
        return supplier;
    }
    

    
    public Response_bill response(Integer id){
        
        Customer customer = customer_repository.findById(id).get();
        Response_bill response_bill = new Response_bill();
        
        response_bill.setProduct(response_product(id));      
        response_bill.setSupplier(response_supplier(id));
        response_bill.setCustomer(customer);
        response_bill.setBill(response_bill(id));
        
        return response_bill;
        
    }
    
    
}
