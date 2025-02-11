package com.practice.spring.springboot.controller;

import com.practice.spring.springboot.beans.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {

    //how to return java object as a Json object to client as a HttpResponse
    //@RequestMapping(method = RequestMethod.GET). == @GetMapping
    @GetMapping("get-customer")
    public ResponseEntity<Customer> getCustomer(){
        Customer customer = new Customer(1,
                "Bageeradha",
                "Vajja",
                "vajjabageeradha@gmail.com");
        return  new ResponseEntity<>(customer,HttpStatus.OK);
    }

    //how to return list of customers as json to client
    @GetMapping("get-customers")
    public List<Customer> getCustomers(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"Sivani","Vajja","sivani@gmail.com"));
        customers.add(new Customer(2,"Bageeradha","vajja","bagee@gmail.com"));
        customers.add(new Customer(2,"Santosh","Bammidi","santosh@gmail.com"));
        return  customers;
    }

    //Spring boot REST API with path variable
    @GetMapping("{customerId}")
    public Customer getCustomerById(@PathVariable int customerId){
        return  new Customer(customerId,"Bageeradha","Vajja","vajjabageeradha@gmail.com");
    }
    @GetMapping("customer")
    public Customer getCustomer(@RequestParam  int customerId, @RequestParam String firstName, @RequestParam String lastName,@RequestParam String emailId){
        return new Customer(customerId,firstName,lastName,emailId);
    }
    @PostMapping("createCustomer")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody Customer customer){
        return customer;
    }
    @PutMapping("updateCustomer/{customerId}g")
    @ResponseStatus(HttpStatus.OK)
    public Customer updateCustomer(@PathVariable int customerId,@RequestBody Customer customer){
        return  customer;
    }
    @DeleteMapping("deleteCustomer/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Customer deleteCustomer(@PathVariable int customerId,@RequestBody Customer customer){
        return customer;
    }
}
