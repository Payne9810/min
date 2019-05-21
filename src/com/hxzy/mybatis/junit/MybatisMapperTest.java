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

import com.hxzy.mybatis.mapper.UserMapper;
import com.hxzy.mybatis.pojo.QueryVo;
import com.hxzy.mybatis.pojo.User;

public class MybatisMapperTest {
	
	@Test
	public void test() throws IOException {
		InputStream in=Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession =sqlSessionFactory.openSession();
		//sqlsession帮我们产生一个实现类
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);//new UserMapperImpl():
		QueryVo vo=new QueryVo();
		
		System.out.println("hehe");
		System.out.println("hello");
		User u=new User();
		u.setUsername("五");
		
		vo.setUser(u);
		List<User>  users=userMapper.findUserByQueryVo(vo);
		for(User u1:users) {
			System.out.println(u1);
			
		}
		
	}
	
	
	
	@Test
	public void test1() throws IOException {
		InputStream in=Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession =sqlSessionFactory.openSession();
		//sqlsession帮我们产生一个实现类
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);//new UserMapperImpl():
		int i=userMapper.countUser();
		System.out.println(i);
	}
	
	
	
	@Test
	public void test2() throws IOException {
		InputStream in=Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession =sqlSessionFactory.openSession();
		//sqlsession帮我们产生一个实现类
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);//new UserMapperImpl():
	    User user=new User();
	    user.setSex("男");
	    user.setUsername("tom");
	    List<User>  users= userMapper.selectUserBySexAndUserName(user);
	    for(User u1:users) {
			System.out.println(u1);
			
		}
	}
	
	
	@Test
	public void test3() throws IOException {
		InputStream in=Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession =sqlSessionFactory.openSession();
		//sqlsession帮我们产生一个实现类
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);//new UserMapperImpl():
		List<Integer> ids=new ArrayList<>();
		ids.add(28);
		ids.add(30);
		ids.add(32);
	
		List<User>  users= userMapper.selectUserByIds(ids);
		 for(User u1:users) {
				System.out.println(u1);
				
		}
	}
	
	
	
	
	
	
	

	
	
	

}
