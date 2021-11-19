@java.lang.Override
public T call() throws java.lang.Exception {
    return impersonator.doAs(namespaceMeta.getNamespaceId(), new java.util.concurrent.Callable<T>() {
        @java.lang.Override
        public T call() throws java.lang.Exception {
            return callable.call();
        }
    });
}