package com.dw.forest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class DiscountResponseDTO {
    private double originalTotal;
    private double discountedTotal;
    private double discountRate;
}
