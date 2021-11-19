@java.lang.Override
public long getNativeFinalizer() {
    if ((io.realm.internal.LinkView.nativeFinalizerPointer) == 0) {
        io.realm.internal.LinkView.nativeFinalizerPointer = io.realm.internal.LinkView.nativeGetFinalizer();
    }
    return io.realm.internal.LinkView.nativeFinalizerPointer;
}