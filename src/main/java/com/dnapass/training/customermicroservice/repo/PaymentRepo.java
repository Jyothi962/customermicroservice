package com.dnapass.training.customermicroservice.repo;

import com.dnapass.training.customermicroservice.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payment, Long> {


}
