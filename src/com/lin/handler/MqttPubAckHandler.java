package com.lin.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.mqtt.MqttMessage;
import io.netty.handler.codec.mqtt.MqttPubAckMessage;

public class MqttPubAckHandler implements MqttMessageHandlerStrategy {

	@Override
	public void handler(ChannelHandlerContext ctx, MqttMessage msg) {
		MqttPubAckMessage pubAckMsg = (MqttPubAckMessage) msg;

	}

}
