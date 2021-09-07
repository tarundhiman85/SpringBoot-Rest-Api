package com.javatechie.jpa.repository;

import com.javatechie.jpa.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
