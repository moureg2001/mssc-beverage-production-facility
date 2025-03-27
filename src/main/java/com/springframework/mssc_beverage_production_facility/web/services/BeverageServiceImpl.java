package com.springframework.mssc_beverage_production_facility.web.services;

import com.springframework.mssc_beverage_production_facility.web.model.BeverageDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class BeverageServiceImpl implements BeverageService {
    @Override
    public BeverageDto getBeverageById(UUID beverageId) {
        return BeverageDto.builder().id(UUID.randomUUID())
                .beverageName("Espresso")
                .beverageDescription("Strong and rich coffee shot")
                .beverageStyle("Coffee")
                .beveragePrice(new BigDecimal("2.99"))
                .upc(123456789012L).build();
    }
}
