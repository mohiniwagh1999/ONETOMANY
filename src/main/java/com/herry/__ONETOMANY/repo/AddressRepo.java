package com.herry.__ONETOMANY.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herry.__ONETOMANY.entity.Address;

public interface AddressRepo extends JpaRepository<Address,Integer> {

}
