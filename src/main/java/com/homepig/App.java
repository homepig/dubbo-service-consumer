package com.homepig;

import com.homepig.dubbo.consumer.Consumer;
import com.homepig.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        Consumer consumer = new Consumer(demoService);
        consumer.run();
    }
}
