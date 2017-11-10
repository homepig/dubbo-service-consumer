package com.homepig.dubbo.consumer;

import com.homepig.dubbo.service.DemoService;

import java.util.Date;

public class Consumer implements Runnable {

    private DemoService demoService;

    public Consumer(DemoService demoService) {
        this.demoService = demoService;
    }

    @Override
    public void run() {
        while (true) {
            String msg = demoService.sayHello(new Date() + "Dubbo 服务调用!");
            System.out.println(msg);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
