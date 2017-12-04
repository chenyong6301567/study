package com.cy.study.roketmq.consumer;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.message.MessageExt;

/**
 * Created by Administrator on 2017/3/7.
 */
@Service
public class MyMessageListenerConcurrently implements MessageListenerConcurrently {

	@Override
	public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list,
			ConsumeConcurrentlyContext consumeConcurrentlyContext) {
		System.out.println(Thread.currentThread().getName() + " Receive New Messages: " + list);
		System.out.println("==============================this is list : " + list.size());
		try {
			for (MessageExt msg : list) {
				String topic = msg.getTopic();
				String tags = msg.getTags();
				byte[] body = msg.getBody();

				System.out.println(
						"MQ -----------------topic:" + topic + " , tags:" + tags + " ,body:" + new String(body));
			}
			return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
