package com.example.demo.repo;

import com.example.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by AnQiLin on 2018/7/10.
 * 用户
 */
@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {

    List<Customer> findAllByName(String name);

    Customer findById(Integer id);

}
