package com.alibaba.otter.canal.handler;

import lombok.extern.slf4j.Slf4j;

/**
 * Canal 线程未捕获异常处理器
 */
@Slf4j
public class CanalThreadUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        log.error("thread "+ t.getName()+" have a exception",e);
    }

}
