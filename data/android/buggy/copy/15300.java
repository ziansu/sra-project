public <T> T invokeAny(java.util.Collection<java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
    return executorService.invokeAny(tasks, timeout, unit);
}