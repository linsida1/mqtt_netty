package com.lin.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.mqtt.MqttMessage;
import io.netty.handler.codec.mqtt.MqttUnsubAckMessage;

public class MqttUnsubAckHandler implements MqttMessageHandlerStrategy {

	@Override
	public void handler(ChannelHandlerContext ctx, MqttMessage msg) {
		MqttUnsubAckMessage unsubMsg = (MqttUnsubAckMessage) msg;
	}

}
