@java.lang.Override
public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    return edu.brown.cs.systems.tracing.aspects.UnadvisedProxy.futureGet(wrapped);
}