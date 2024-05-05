package com.lmax.disruptor;

/**
 * Implementors of this interface must provide a single long value
 */
public interface Cursored {
    long getCursor();
}
