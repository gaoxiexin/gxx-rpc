package com.gxx.rpc.service; 

import java.util.List;

import com.gxx.rpc.entity.User;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：Nov 14, 2016 11:32:50 AM 
 * 类说明 
 */
public interface IHelloService {
	public String hello(String name);
	
	public User getUser(String name);
	
	public List<User> getUsers(int size);
	
	public User updateUser(User user);
}
 