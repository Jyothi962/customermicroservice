package com.dnapass.training.customermicroservice.repo;

import com.dnapass.training.customermicroservice.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer, Long>, PagingAndSortingRepository<Customer, Long> {
    List<Customer> addcustomer();

    List<Customer> findcustomer(String id);

    List<Customer> findcustomers(String id);
}
