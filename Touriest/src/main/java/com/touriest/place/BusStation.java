package com.touriest.place;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BusStation extends JpaRepository<Busservice,Integer>
{
}
