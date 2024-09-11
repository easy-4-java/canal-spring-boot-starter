package com.alibaba.otter.canal.handler;

/**
 * 处理 Entry
 * @param <R> Entry
 */
public interface EntryHandler<R> {



    default void insert(R t) {

    }


    default void update(R before, R after) {

    }


    default void delete(R t) {

    }
}
