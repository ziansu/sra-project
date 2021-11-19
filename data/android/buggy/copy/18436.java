void registerActionSubscriber(java.lang.Class<?> storeClass) {
    java.util.concurrent.ExecutorService storeExecutor = java.util.concurrent.Executors.newFixedThreadPool(1);
    if (storeClass.isAnnotationPresent(com.nigelbrown.fluxion.Annotation.Store.class)) {
        storeExecutor.execute(new com.nigelbrown.fluxion.Flux.MethodsWithActionAnnotationHelperRunnable(storeClass));
    }
}