/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Customer_service.BillBLL;

import com.Js.Customer_service.Entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Asus
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response_bill {
    
    private Bill bill;
    private Customer customer;
    private Product product;
    private Supplier supplier;
}
