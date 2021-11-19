public static java.util.concurrent.ExecutorService createNewService(final int size, final java.lang.String threadNameFormat) {
    return new com.kolich.curacao.util.AsyncServletExecutorServiceFactory(size).setDaemon(true).setPriority(java.lang.Thread.MAX_PRIORITY).setThreadNameFormat(threadNameFormat).build();
}