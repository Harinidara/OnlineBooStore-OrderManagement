package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.entity.Order;

public interface OrderDao extends JpaRepository<Order,Integer> {

	
	
	

}
