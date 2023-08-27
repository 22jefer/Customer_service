/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Customer_service.BillBLL;

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
public class Bill {
    
    private int id;

    private String date;

    private String paymentMethod;

    private Double taxes;

    private Double total;

    private String paymentCondition;

    private int productId;

    private int supplierId;
    
}
