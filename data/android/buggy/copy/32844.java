@java.lang.Override
@org.jetbrains.annotations.Nullable
public T get() {
    LazyFactory.LazyImplConcurrentLockFree.atomicResultUpdater.compareAndSet(this, LazyFactory.LazyImpl.noResultYet, supplier.get());
    return result;
}