@java.lang.Override
public void emitError(java.lang.Throwable pThrowable) {
    super.emitError(pThrowable);
    pOnThrowable.accept(pThrowable);
}