package com.manoj.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manoj.entities.Address;

public interface IAddressPersistence extends JpaRepository<Address, String> {

}
