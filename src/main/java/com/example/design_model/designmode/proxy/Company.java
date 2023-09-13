package com.example.design_model.designmode.proxy;

/*
d代理模式指为对象提供一种通过代理的方式来访问并控制该对象行为的方法
客户端   ==》  中介者    ==《 服务端
代理模式有两种角色 ： 被代理者  和   代理

比如  公司Company找人不需要直接做， 而是交给猎头公司HR做

 */
public interface Company {
    void findWorker(String title);//定义一个接口的方法
}


