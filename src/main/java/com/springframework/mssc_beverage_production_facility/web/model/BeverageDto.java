package com.springframework.mssc_beverage_production_facility.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeverageDto {
    private UUID id;
    private String beverageName;
    private String beverageDescription;
    private String beverageStyle;
    private BigDecimal beveragePrice;
    private Long upc;
}
