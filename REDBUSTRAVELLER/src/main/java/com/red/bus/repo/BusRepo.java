package com.red.bus.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.red.bus.Bus;
@Repository
public interface BusRepo extends JpaRepository<Bus,Integer>
{

}
