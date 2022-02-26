package com.turkcell.northwindproject.business.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ListProductDto {
    private int productId;
    private String productName;
    private double unitPrice;
    private String quantityPerUnit;
    private int unitsInStock;

}
