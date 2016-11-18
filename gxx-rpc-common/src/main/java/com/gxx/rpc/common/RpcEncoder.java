package com.gxx.rpc.common; 

import com.gxx.rpc.util.SerializationUtil;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：Nov 14, 2016 11:52:08 AM 
 * 类说明 
 */
@SuppressWarnings("rawtypes")
public class RpcEncoder extends MessageToByteEncoder{

	private Class<?> genericClass;

    public RpcEncoder(Class<?> genericClass) {
        this.genericClass = genericClass;
    }

    @Override
    public void encode(ChannelHandlerContext ctx, Object in, ByteBuf out) throws Exception {
        if (genericClass.isInstance(in)) {
            byte[] data = SerializationUtil.serialize(in);
            out.writeInt(data.length);
            out.writeBytes(data);
        }
    }

}
 