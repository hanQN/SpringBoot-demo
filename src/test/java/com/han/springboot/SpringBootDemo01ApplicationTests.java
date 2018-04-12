package com.han.springboot;

import com.han.bean.User;
import com.han.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RunWith(SpringRunner.class)
@SpringBootTest
@RestController
public class SpringBootDemo01ApplicationTests {

	@Autowired(required = false)
	private UserMapper userMapper;

	@Test
	public void contextLoads() {

	}

	@RequestMapping("/")
	public void findByName() throws Exception{
		userMapper.insert("handaren", 20);
		User user = userMapper.findByName("handaren");
		Assert.assertEquals(20, user.getAge().intValue());
	}

}
