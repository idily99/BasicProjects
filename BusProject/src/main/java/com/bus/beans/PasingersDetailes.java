package com.bus.beans;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
 public interface PasingersDetailes extends JpaRepository<Bus,String>
{

List<Bus> findBySource(String source);
}
