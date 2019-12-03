package com.discountAssessment2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import test.discountAssessment2.service.CalculateBill;

@RestController
class HomeController {

  private final CalculateBill repository;

  HomeController(CalculateBill repository) {
    this.repository = repository;
  }

  // Single item

  @GetMapping("/calc/{customerType}/{billAmount}/{groceriesAmount}/{customerSince}")
  double one(@PathVariable String customerType, @PathVariable double billAmount,  @PathVariable double groceriesAmount,  @PathVariable double customerSince) {
    return repository.findBill(customerType, billAmount, groceriesAmount, customerSince);
  }
}