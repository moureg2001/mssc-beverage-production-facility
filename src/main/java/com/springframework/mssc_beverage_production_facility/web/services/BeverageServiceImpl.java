package com.springframework.mssc_beverage_production_facility.web.services;

import com.springframework.mssc_beverage_production_facility.web.model.BeverageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Slf4j
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

    @Override
    public BeverageDto saveNewBeverage(BeverageDto beverageDto) {
        log.debug("Saving Beverage ...");

        return BeverageDto.builder()
                .id(UUID.randomUUID())
                .beverageName(beverageDto.getBeverageName())
                .beverageStyle(beverageDto.getBeverageStyle())
                .beverageDescription(beverageDto.getBeverageDescription())
                .beveragePrice(beverageDto.getBeveragePrice())
                .upc(beverageDto.getUpc()).build();
    }

    @Override
    public BeverageDto updateBeverage(UUID beverageId, BeverageDto beverageDto) {
        // TODO - would add a real impl to update Beverage
        log.debug("Updating Beverage ...");
        return null;
    }

    @Override
    public void deleteBeverageById(UUID beverageId) {
        // TODO - would add a real impl to Delete Beverage
        log.debug("Deleting Beverage ...");

    }
}
