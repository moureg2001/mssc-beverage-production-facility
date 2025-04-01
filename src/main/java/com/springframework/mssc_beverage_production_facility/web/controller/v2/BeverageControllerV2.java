package com.springframework.mssc_beverage_production_facility.web.controller.v2;

import com.springframework.mssc_beverage_production_facility.web.model.v2.BeverageDtoV2;
import com.springframework.mssc_beverage_production_facility.web.services.v2.BeverageServiceV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v2/beverage")
public class BeverageControllerV2 {

    private final BeverageServiceV2 beverageService;

    public BeverageControllerV2(BeverageServiceV2 beverageService) {
        this.beverageService = beverageService;
    }

    @GetMapping("/{beverageId}")
    public ResponseEntity<com.springframework.mssc_beverage_production_facility.web.model.v2.BeverageDtoV2> getBeverage(@PathVariable("beverageId") UUID beverageId) {
        return new ResponseEntity<>(beverageService.getBeverageById(beverageId), HttpStatus.OK);
    }

    @PostMapping// POST create new Beverage
    public ResponseEntity<BeverageDtoV2> handleBeveragePost(@RequestBody BeverageDtoV2 beverageDto) {
        BeverageDtoV2 saverDto = beverageService.saveNewBeverage(beverageDto);
        HttpHeaders headers = new HttpHeaders();
        // TODO add HOST name to URL
        headers.add("Location", "/api/v1/beverage/" + saverDto.getId().toString());
        return new ResponseEntity<>(saverDto, headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beverageId}")
    public ResponseEntity<BeverageDtoV2> handleBeverageUpdate(@PathVariable("beverageId")UUID beverageId, @RequestBody BeverageDtoV2 beverageDto) {
        BeverageDtoV2 saverDto = beverageService.updateBeverage(beverageId, beverageDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beverageId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleBeverageDelete(@PathVariable("beverageId")UUID beverageId){
        beverageService.deleteBeverageById(beverageId);
    }
}
