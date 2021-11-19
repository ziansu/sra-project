@java.lang.Override
public final <V> V postAndWait(com.facebook.stetho.common.UncheckedCallable<V> c) {
    return mEnforcer.postAndWait(c);
}