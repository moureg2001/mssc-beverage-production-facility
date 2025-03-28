package com.springframework.mssc_beverage_production_facility.web.services;

import com.springframework.mssc_beverage_production_facility.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .customerName("John Doe")
                .customerEmail("john.doe@example.com")
                .customerPhone("+1-555-123-4567")
                .customerAddress("123 Elm Street")
                .customerCity("Los Angeles")
                .customerState("CA")
                .customerCountry("USA")
                .customerZipCode("90001")
                .build();
    }
}
