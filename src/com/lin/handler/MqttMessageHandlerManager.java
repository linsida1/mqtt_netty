package com.lin.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.mqtt.MqttMessage;
import io.netty.handler.codec.mqtt.MqttMessageType;

import java.util.HashMap;
import java.util.Map;

import com.lin.exception.UnknowMqttMsgTypeException;

public class MqttMessageHandlerManager implements MqttMessageHandlerStrategy {

	private final Map<MqttMessageType, MqttMessageHandlerStrategy> strategy = new HashMap<MqttMessageType, MqttMessageHandlerStrategy>();
	private static final MqttMessageHandlerManager singleton = new MqttMessageHandlerManager();

	public static MqttMessageHandlerManager instance() {
		return singleton;
	}

	private MqttMessageHandlerManager() {
		init();
	}

	private void init() {
		strategy.put(MqttMessageType.CONNACK, new MqttConnAckHandler());
		strategy.put(MqttMessageType.SUBACK, new MqttSubAckHandler());
		strategy.put(MqttMessageType.PUBLISH, new MqttPublishHandler());
		strategy.put(MqttMessageType.UNSUBACK, new MqttUnsubAckHandler());
		strategy.put(MqttMessageType.PUBACK, new MqttPubAckHandler());
		strategy.put(MqttMessageType.PUBREC, new MqttPubRecHandler());
		strategy.put(MqttMessageType.PUBREL, new MqttPubRelHandler());
		strategy.put(MqttMessageType.PUBCOMP, new MqttPubCompHandler());

	}

	@Override
	public void handler(ChannelHandlerContext ctx, MqttMessage msg) throws Exception {
		MqttMessageHandlerStrategy handler = strategy.get(msg.fixedHeader().messageType());
		if (handler == null) {
			throw new UnknowMqttMsgTypeException("mqtt msg type[" + msg.fixedHeader().messageType() + "]");
		}
		handler.handler(ctx, msg);
	}

}
