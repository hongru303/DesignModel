package com.example.design_model.designmode.proxy;

import java.util.HashMap;
import java.util.Map;

/*
代理模式指为对象提供一种通过代理的方式来访问并控制该对象行为的方法
客户端   ==》  中介者    ==《 服务端
代理模式有两种角色 ： 被代理者  和   代理

Hr 和  代理  同时继承公司的接口
比如  公司Company找人不需要直接做， 而是交给猎头公司HR做
 */

//定义一个代理类继承公司的接口，实现公司接口中的findWorker方法
public class Proxy implements Company {
//    private final static Log logger = LogFactory.getLog(Proxy.class)
    private Hr hr;

    public Proxy() {
        super();
        this.hr = new Hr();
    }
    //跟Hr对接
    @Override
    public void findWorker(String title) {
        hr.findWorker(title);//   1，公司先给提出需要的种类
        String worker = getWorker(title);//   2 ，从代理类中返回worker
//        Logger.getLogger("find a work by proxy, work name is  : "  + worker);
        System.out.println("Proxy    ---    find a work by proxy, work name is  : " + worker);
    }

    private String getWorker(String title) {
        //定义类一个HashMap存放键值对
        Map<String, String> workerList = new HashMap<String, String>() {
            {
                put("java", "chris java is full");
                put("python", "chris python is full");
                put("c++", "chris c++ is full");
            }
        };
        return workerList.get(title);
    }

    public static void main(String[] args) {
        Company company = new Proxy();
        company.findWorker("python");
    }

}
