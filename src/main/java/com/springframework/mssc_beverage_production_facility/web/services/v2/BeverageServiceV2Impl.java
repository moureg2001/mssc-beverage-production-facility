package com.springframework.mssc_beverage_production_facility.web.services.v2;

import com.springframework.mssc_beverage_production_facility.web.model.v2.BeverageDtoV2;
import com.springframework.mssc_beverage_production_facility.web.model.v2.BeverageStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Slf4j
@Service
public class BeverageServiceV2Impl implements BeverageServiceV2 {
    @Override
    public BeverageDtoV2 getBeverageById(UUID beverageId) {
        return BeverageDtoV2.builder().id(UUID.randomUUID())
                .beverageName("Espresso")
                .beverageDescription("Strong and rich coffee shot")
                .beverageStyle(BeverageStyle.COFFEE)
                .beveragePrice(new BigDecimal("2.99"))
                .upc(123456789012L).build();
    }

    @Override
    public BeverageDtoV2 saveNewBeverage(BeverageDtoV2 beverageDto) {
        log.debug("Saving Beverage ...");

        return BeverageDtoV2.builder()
                .id(UUID.randomUUID())
                .beverageName(beverageDto.getBeverageName())
                .beverageStyle(beverageDto.getBeverageStyle())
                .beverageDescription(beverageDto.getBeverageDescription())
                .beveragePrice(beverageDto.getBeveragePrice())
                .upc(beverageDto.getUpc()).build();
    }

    @Override
    public BeverageDtoV2 updateBeverage(UUID beverageId, BeverageDtoV2 beverageDto) {
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
