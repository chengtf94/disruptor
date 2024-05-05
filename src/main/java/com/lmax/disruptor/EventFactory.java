package com.lmax.disruptor;

/**
 * 事件工厂
 */
public interface EventFactory<T> {
    T newInstance();
}