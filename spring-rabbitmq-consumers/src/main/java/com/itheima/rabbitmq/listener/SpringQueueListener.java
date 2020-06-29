/**
 *  Copyright (C), 2015-2020
 * FileName: SpringQueueListener
 * Author: hanlong
 * Date: 2020/6/29 10:41 上午
 * Description:
 */
package com.itheima.rabbitmq.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/** Copyright (C), 2015-2020 
 * FileName: SpringQueueListener 
 * Author: hanlong 
 * Date: 2020/6/29 10:41 上午 
 *Description: 
 */
public class SpringQueueListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        //打印消息
        System.out.println(new String(message.getBody()));
    }
}
