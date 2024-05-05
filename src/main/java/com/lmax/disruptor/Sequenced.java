package com.lmax.disruptor;

public interface Sequenced {

    int getBufferSize();
    boolean hasAvailableCapacity(int requiredCapacity);
    long remainingCapacity();
    long next();
    long next(int n);
    long tryNext() throws InsufficientCapacityException;
    long tryNext(int n) throws InsufficientCapacityException;
    void publish(long sequence);
    void publish(long lo, long hi);

}