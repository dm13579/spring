package com.dm;

import com.dm.config.JdbcConfig;
import com.dm.entity.UserEntity;
import com.dm.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMyBatisMainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
		UserEntity userEntity = userServiceImpl.findOne(1);
		System.out.println(userEntity.getName());

	}
}
