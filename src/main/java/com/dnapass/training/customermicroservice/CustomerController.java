package com.dnapass.training.customermicroservice;


import com.dnapass.training.customermicroservice.entity.Customer;
import com.dnapass.training.customermicroservice.repo.CustomerRepo;
import com.dnapass.training.customermicroservice.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/api")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private PaymentRepo paymentRepo;


    //addcustomers
    @PostMapping("api/customers ")
    public List<Customer> addcustomer() {
        List<Customer> customerList = customerRepo.addcustomer();
        return customerList;
    }


    //findEmployee
    @GetMapping("api/customers/{id}")
    public List<Customer> findCustomer(@PathVariable String id) {
        return customerRepo.findcustomer(id);
    }

    //findcustomers
    @GetMapping("api/customers")
    public List<Customer> findCustomers(@PathVariable String id) {
        return customerRepo.findcustomers(id);
    }


}
