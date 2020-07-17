package com.capgemini.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.dao.OrderDao;
import com.capgemini.entity.Order;



@Service
@Transactional
public class OrderServiceImpl implements OrderService{

	
	@Autowired
	private OrderDao dao;
	
	
	@Override
	public String updateCustomerInfo(Order order) {
		
		dao.save(order);
		
		return "successfully inserted";
	}
	
	
	

}
