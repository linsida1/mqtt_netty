package com.lin.broker;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.mqtt.MqttMessage;

import com.lin.handler.MqttMessageHandlerManager;

public class MqttHandler extends SimpleChannelInboundHandler<MqttMessage> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, MqttMessage msg) throws Exception {
		MqttMessageHandlerManager.instance().handler(ctx, msg);

	}
}
