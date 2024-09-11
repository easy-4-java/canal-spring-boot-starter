package com.alibaba.otter.canal.handler;

import com.alibaba.otter.canal.protocol.CanalEntry;

/**
 * 处理行数据
 * @param <T> 行数据
 */
public interface RowDataHandler<T> {

    <R> void handlerRowData(T t, EntryHandler<R> entryHandler, CanalEntry.EventType eventType) throws Exception;

}
