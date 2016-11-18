package com.gxx.rpc.common; 
/** 
 * @author 作者 E-mail: 
 * @version 创建时间：Nov 14, 2016 11:47:22 AM 
 * 类说明 
 */
public interface Constant {
	/**
	 * 超时连接时间
	 */
	static int ZK_SESSION_TIMEOUT = 5000;
	/**
	 * 在创建数据节点前，先用zkCli.sh客户端连接上服务端，查看目前存在的数据节点，
	 * 把下面的/zookeeper/gxx改为你自己的，/zookeeper/gxx是我自己Zookeeper的节点
	 */
    String ZK_REGISTRY_PATH = "/zookeeper";
    String ZK_DATA_PATH = ZK_REGISTRY_PATH+"/quota";
}
 