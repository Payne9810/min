package com.hxzy.mybatis.junit;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hxzy.mybatis.mapper.OrderMapper;
import com.hxzy.mybatis.mapper.UserMapper;
import com.hxzy.mybatis.pojo.Orders;
import com.hxzy.mybatis.pojo.QueryVo;
import com.hxzy.mybatis.pojo.User;

public class MybatisMapperTest2 {
	
	@Test
	public void test() throws IOException {
		InputStream in=Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession =sqlSessionFactory.openSession();
		//sqlsession帮我们产生一个实现类
		OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);//new UserMapperImpl():
		
		List<Orders> orderlist=orderMapper.selcetOrders();
		for(Orders o:orderlist) {
			
			System.out.println(o);
		}
		
	}	
		@Test
		public void test1() throws IOException {
			InputStream in=Resources.getResourceAsStream("sqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
			SqlSession sqlSession =sqlSessionFactory.openSession();
			//sqlsession帮我们产生一个实现类
			OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);//new UserMapperImpl():
			List<User> user = orderMapper.selcetUserList();
			for(User u:user) {
				System.out.println(u);
				
			}
			
		

	
	
	}
}
