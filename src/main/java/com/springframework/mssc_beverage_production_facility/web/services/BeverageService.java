package com.springframework.mssc_beverage_production_facility.web.services;

import com.springframework.mssc_beverage_production_facility.web.model.BeverageDto;

import java.util.UUID;


public interface BeverageService {
    BeverageDto getBeverageById(UUID beverageId);

    BeverageDto saveNewBeverage(BeverageDto beverageDto);

    BeverageDto updateBeverage(UUID beverageId, BeverageDto beverageDto);

    void deleteBeverageById(UUID beverageId);
}
