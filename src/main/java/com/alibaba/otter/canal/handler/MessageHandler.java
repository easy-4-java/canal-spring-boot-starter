package com.alibaba.otter.canal.handler;

/**
 * 消息处理器
 * @param <T> 消息
 */
@FunctionalInterface
public interface MessageHandler<T> {

    /**
     * 处理消息
     * @param destination canal 指令
     * @param t 消息
     */
    void handleMessage(String destination, T t);

}
