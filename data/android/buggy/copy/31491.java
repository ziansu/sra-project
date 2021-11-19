public com.codeabovelab.dm.common.utils.SingleValueCache.Builder<T> timeAfterWrite(java.util.concurrent.TimeUnit unit, long ttl) {
    setTimeAfterWrite(unit.toMillis(ttl));
    return this;
}