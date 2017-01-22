package com.lin.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.mqtt.MqttMessage;
import io.netty.handler.codec.mqtt.MqttPublishMessage;

public class MqttPublishHandler implements MqttMessageHandlerStrategy {

	@Override
	public void handler(ChannelHandlerContext ctx, MqttMessage msg) {
		MqttPublishMessage publishMsg = (MqttPublishMessage) msg;

	}

}
