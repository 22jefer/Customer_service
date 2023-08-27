/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Js.Customer_service.Repository;

import com.Js.Customer_service.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Asus
 */

public interface Customer_repository extends JpaRepository<Customer, Integer>{
    
}
