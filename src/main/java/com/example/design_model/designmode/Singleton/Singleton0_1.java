package com.example.design_model.designmode.Singleton;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例模式就是创建某一个对象时，只有这个唯一的途径
 *
 * 静态类的时候也是夜歌单例模式
 */

public class Singleton0_1 {

    private static ConcurrentHashMap<String, String> cache = new ConcurrentHashMap();
}
