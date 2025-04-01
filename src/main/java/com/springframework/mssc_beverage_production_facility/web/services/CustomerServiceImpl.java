package com.springframework.mssc_beverage_production_facility.web.services;

import com.springframework.mssc_beverage_production_facility.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
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

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .customerName(customerDto.getCustomerName())
                .customerAddress(customerDto.getCustomerAddress())
                .customerCity(customerDto.getCustomerCity())
                .customerCountry(customerDto.getCustomerCountry())
                .customerState(customerDto.getCustomerState())
                .customerZipCode(customerDto.getCustomerZipCode())
                .customerEmail(customerDto.getCustomerEmail())
                .customerPhone(customerDto.getCustomerPhone()).build();
    }

    @Override
    public CustomerDto updateCustomer(UUID customerId, CustomerDto customerDto) {
        // TODO - would add a real impl to update Customer
        log.debug("Updating Customer ...");
        return null;
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        // TODO - would add a real impl to Delete Beverage
        log.debug("Deleting Customer ...");

    }
}
