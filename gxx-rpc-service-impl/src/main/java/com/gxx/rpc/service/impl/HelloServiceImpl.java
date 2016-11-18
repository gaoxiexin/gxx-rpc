package com.gxx.rpc.service.impl;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.gxx.rpc.annotation.RpcService;
import com.gxx.rpc.entity.User;
import com.gxx.rpc.service.IHelloService;

/**
 * 
 * @ClassName:  HelloServiceImpl   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Android_Robot  
 * @date:   Nov 14, 2016 1:54:08 PM   
 *
 */
//指定远程接口  使用 RpcService注解定义在服务接口的实现类上，
//需要对该实现类指定远程接口，因为实现类可能会实现多个接口，一定要告诉框架哪个才是远程接口。
@RpcService(IHelloService.class)
public class HelloServiceImpl implements IHelloService {

	public String hello(String name) {
		String result = "hello" + name;
		System.out.println(result);
		return result;
	}

	public User getUser(String name) {
		User user = new User(name, new Date(), true);
		return user;
	}

	public List<User> getUsers(int size) {
		List<User> list = new ArrayList<User>();
		User user = null;
		String name = "foo";
		Date birthday = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(birthday);
		for(int i = 0; i < size; i++){
			cal.add(Calendar.DAY_OF_MONTH, 1);
			user = new User(name, cal.getTime(), i%2==0 ? true : false);
			list.add(user);
		}
		return list;
	}

	public User updateUser(User user) {
		user.setName(user.getName() + "-update");
		return user;
	}

}
 