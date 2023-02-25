/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndk.pojo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author admin
 */
@Entity
@Table (name = "order_detail")
@Getter
@Setter
@NoArgsConstructor
public class OrderDetails implements Serializable{
    @Id
    @gen
    private int id;
    private int orderID;
    private int productID;
    private double unitPrice;
    private String num;
            
 }
