package com.hxzy.mybatis.mapper;

import java.util.List;

import com.hxzy.mybatis.pojo.Orders;
import com.hxzy.mybatis.pojo.User;

public interface OrderMapper {

	//一對多
	public List<Orders> selcetOrders();
	
	public List<User> selcetUserList();
	
}
