package com.gxx.rpc.common; 

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

import com.gxx.rpc.util.SerializationUtil;

/** 
 * @author 作者 E-mail: 
 * @version 创建时间：Nov 14, 2016 11:48:49 AM 
 * 类说明 
 */
public class RpcDecoder extends ByteToMessageDecoder{
	private Class<?> genericClass;

    public RpcDecoder(Class<?> genericClass) {
        this.genericClass = genericClass;
    }
	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in,
			List<Object> out) throws Exception {
		  if (in.readableBytes() < 4) {
	            return;
	        }
	        in.markReaderIndex();
	        int dataLength = in.readInt();
	        if (dataLength < 0) {
	            ctx.close();
	        }
	        if (in.readableBytes() < dataLength) {
	            in.resetReaderIndex();
	        }
	        byte[] data = new byte[dataLength];
	        in.readBytes(data);

	        Object obj = SerializationUtil.deserialize(data, genericClass);
	        out.add(obj);
		
	}

}
 