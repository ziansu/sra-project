private boolean writeToQueue(final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> buffer, final E e, final long index, final int offset) {
    soProducerIndex((index + 1));
    org.jctools.queues.atomic.SpscUnboundedAtomicArrayQueue.soElement(buffer, offset, e);
    return true;
}