package com.springframework.mssc_beverage_production_facility.web.services;

import com.springframework.mssc_beverage_production_facility.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
