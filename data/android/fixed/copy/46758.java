public static <E> reactor.core.processor.RingBufferProcessor<E> create(java.util.concurrent.ExecutorService service, boolean autoCancel) {
    return reactor.core.processor.RingBufferProcessor.create(service, reactor.core.processor.SMALL_BUFFER_SIZE, new reactor.core.processor.BlockingWaitStrategy(), autoCancel);
}