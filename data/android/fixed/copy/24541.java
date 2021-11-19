@java.lang.Override
public java.lang.Thread newThread(java.lang.Runnable runnable) {
    return new java.lang.Thread(runnable, ((com.fernandocejas.android10.sample.data.executor.JobExecutor.JobThreadFactory.THREAD_NAME) + ((counter)++)));
}