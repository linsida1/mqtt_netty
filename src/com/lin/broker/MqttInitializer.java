package com.lin.broker;


import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.mqtt.MqttDecoder;
import io.netty.handler.codec.mqtt.MqttEncoder;
import io.netty.handler.timeout.IdleStateHandler;

public class MqttInitializer extends ChannelInitializer<SocketChannel> {

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		ch.pipeline()
				.addFirst("idleStateHandler", new IdleStateHandler(0, 0, 60))
				.addAfter("idleStateHandler", "idleEventHandler",
						new MqttIdleTimeOutHandler())
				.addLast("decoder", new MqttDecoder())
				.addLast("encoder", MqttEncoder.INSTANCE)
				.addLast("handler", new MqttHandler())
		;

	}

}
