/**
 *  Copyright (C), 2015-2020
 * FileName: ConsumerTest
 * Author: hanlong
 * Date: 2020/6/29 10:45 上午
 * Description:
 */
package com.itheima;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** Copyright (C), 2015-2020 
 * FileName: ConsumerTest 
 * Author: hanlong 
 * Date: 2020/6/29 10:45 上午 
 *Description: 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-rabbitmq-consumer.xml")
public class ConsumerTest {
    @Test
    public void test1(){
        boolean flag = true;
        while (true){

        }
    }
}
