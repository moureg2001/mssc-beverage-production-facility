package com.springframework.mssc_beverage_production_facility.web.controller;

import com.springframework.mssc_beverage_production_facility.web.model.BeverageDto;
import com.springframework.mssc_beverage_production_facility.web.services.BeverageService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Deprecated
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

    @PostMapping// POST create new Beverage
    public ResponseEntity<BeverageDto> handleBeveragePost(@RequestBody BeverageDto beverageDto) {
        BeverageDto saverDto = beverageService.saveNewBeverage(beverageDto);
        HttpHeaders headers = new HttpHeaders();
        // TODO add HOST name to URL
        headers.add("Location", "/api/v1/beverage/" + saverDto.getId().toString());
        return new ResponseEntity<>(saverDto, headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beverageId}")
    public ResponseEntity<BeverageDto> handleBeverageUpdate(@PathVariable("beverageId")UUID beverageId, @RequestBody BeverageDto beverageDto) {
        BeverageDto saverDto = beverageService.updateBeverage(beverageId, beverageDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beverageId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleBeverageDelete(@PathVariable("beverageId")UUID beverageId){
        beverageService.deleteBeverageById(beverageId);
    }
}
