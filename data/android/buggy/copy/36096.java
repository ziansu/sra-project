@java.lang.Override
public void emitError(java.lang.Throwable pThrowable) {
    pOnThrowable.accept(pThrowable);
}