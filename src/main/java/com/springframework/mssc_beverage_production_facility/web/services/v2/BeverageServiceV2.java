package com.springframework.mssc_beverage_production_facility.web.services.v2;

import com.springframework.mssc_beverage_production_facility.web.model.v2.BeverageDtoV2;

import java.util.UUID;


public interface BeverageServiceV2 {
    BeverageDtoV2 getBeverageById(UUID beverageId);

    BeverageDtoV2 saveNewBeverage(BeverageDtoV2 beverageDto);

    BeverageDtoV2 updateBeverage(UUID beverageId, BeverageDtoV2 beverageDto);

    void deleteBeverageById(UUID beverageId);
}
