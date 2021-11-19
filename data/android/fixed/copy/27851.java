@java.lang.Override
public void run() throws java.lang.Exception {
    com.hazelcast.concurrent.atomicreference.AtomicReferenceContainer atomicReferenceContainer = getReferenceContainer();
    returnValue = atomicReferenceContainer.compareAndSet(expect, update);
    shouldBackup = returnValue;
}