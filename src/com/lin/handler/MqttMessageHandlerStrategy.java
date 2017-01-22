package com.lin.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.mqtt.MqttMessage;

public interface MqttMessageHandlerStrategy {

	public void handler(ChannelHandlerContext ctx, MqttMessage msg)
			throws Exception;

}
