@java.lang.Override
public java.lang.Thread newThread(java.lang.Runnable r) {
    return new java.lang.Thread(("ExecutorManager-thread-" + (mAtomicInteger.getAndIncrement())));
}