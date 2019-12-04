package com.discountAssessment2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.discountAssessment2.service.CalculateBill;
import com.discountAssessment2.service.InvoicePayload;

@RestController
class HomeController {

	@Autowired
  private final CalculateBill service;

  HomeController(CalculateBill repository) {
    this.service = repository;
  }

 //http://localhost:8080/calc/123/employee/1900/200/2015 
  @GetMapping("/calc/{uid}/{customerType}/{billAmount}/{groceriesAmount}/{customerSince}")
  public InvoicePayload processInvoiceCalculation(@PathVariable String uid, @PathVariable String customerType, @PathVariable double billAmount, 
		  @PathVariable double groceriesAmount, 
		  @PathVariable int customerSince) {
    return service.findBill(uid,customerType, billAmount, groceriesAmount, customerSince);
  }
}