package com.mobile.mobile.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "mobile_details")

public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private  int id;

    @Column(name = "product_names")
    private String  productName;

    @Column(name = "product_price")
    private  String productPrice;

    @Column(name = "product_colour")
    private String productColour;


}

