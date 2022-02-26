package com.turkcell.northwindproject.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class createProductRequest {
    private String productName;
    private double unitPrice;
    private String quantityPerUnit;
    private int unitsInStock;
}
