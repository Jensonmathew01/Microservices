package com.UST.Flightservices.repo;

import com.UST.Flightservices.entity.Passengerinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Passengerrepo extends JpaRepository<Passengerinfo,Long> {
}
