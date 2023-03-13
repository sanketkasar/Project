package com.bloodbank.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloodbank.entities.Address;

@Repository
public interface AddressDAO extends JpaRepository<Address, Long> {

}
