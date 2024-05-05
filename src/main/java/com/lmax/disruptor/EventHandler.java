package com.lmax.disruptor;

/**
 * 事件处理器
 */
public interface EventHandler<T> {
    void onEvent(T event, long sequence, boolean endOfBatch) throws Exception;
}
