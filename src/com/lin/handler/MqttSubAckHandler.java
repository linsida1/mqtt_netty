package com.lin.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.mqtt.MqttMessage;
import io.netty.handler.codec.mqtt.MqttSubAckMessage;

public class MqttSubAckHandler implements MqttMessageHandlerStrategy {

	@Override
	public void handler(ChannelHandlerContext ctx, MqttMessage msg) {
		MqttSubAckMessage subMsg = (MqttSubAckMessage) msg;

	}

}
