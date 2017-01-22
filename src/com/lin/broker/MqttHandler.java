package com.lin.broker;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.mqtt.MqttMessage;

import com.lin.exception.UnknowMqttMsgTypeException;

public class MqttHandler extends SimpleChannelInboundHandler<MqttMessage> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, MqttMessage msg)
			throws Exception {
		switch (msg.fixedHeader().messageType()) {
		case CONNACK:
			break;
		case SUBACK:
			break;
		case UNSUBACK:
			break;
		case PUBLISH:
			break;
		case PUBACK:
			break;
		case PUBREC:
			break;
		case PUBCOMP:
			break;
		default:
			throw new UnknowMqttMsgTypeException("mqtt msg type[" + msg.fixedHeader().messageType() + "]");
		}

	}
}
