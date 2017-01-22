package com.lin.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.mqtt.MqttConnAckMessage;
import io.netty.handler.codec.mqtt.MqttMessage;

public class MqttConnAckHandler implements MqttMessageHandlerStrategy {

	@Override
	public void handler(ChannelHandlerContext ctx, MqttMessage msg) {
		MqttConnAckMessage connAck = (MqttConnAckMessage) msg;

	}

}

