package com.example.design_model.designmode.adapter;
/*
适配器模式： 通过定义一个适配器类作为两个不兼容的接口之间的桥梁
就像扩展坞，是电脑跟手机连接起来
 */
//类适配器模式
public class Adapter extends Source implements Targetable{//适配器类

//    @Override
//    public void write() {
//       System.out.println("Adapter   write");
//    } //原来的需要适配的类里面有了，不需要在适配这个方法了

    @Override
    public void read() {
        System.out.println("Adapter   read");
    }


    public static void main(String[] args){
        //new一个接口类型的适配器类的对象实例
        Targetable tar = new Adapter();
        tar.read();
        tar.write();
    }
}
