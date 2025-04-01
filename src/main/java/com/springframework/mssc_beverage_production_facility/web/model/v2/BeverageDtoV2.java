package com.springframework.mssc_beverage_production_facility.web.model.v2;

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
public class BeverageDtoV2 {
    private UUID id;
    private String beverageName;
    private String beverageDescription;
    private BeverageStyle beverageStyle;
    private BigDecimal beveragePrice;
    private Long upc;
}
