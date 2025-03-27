package com.springframework.mssc_beverage_production_facility.web.controller;

import com.springframework.mssc_beverage_production_facility.web.model.BeverageDto;
import com.springframework.mssc_beverage_production_facility.web.services.BeverageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beverage")
public class BeverageController {

    private final BeverageService beverageService;

    public BeverageController(BeverageService beverageService) {
        this.beverageService = beverageService;
    }

    @GetMapping("/{beverageId}")
    public ResponseEntity<BeverageDto> getBeverage(@PathVariable("beverageId") UUID beverageId) {
        return new ResponseEntity<>(beverageService.getBeverageById(beverageId), HttpStatus.OK);
    }
}
