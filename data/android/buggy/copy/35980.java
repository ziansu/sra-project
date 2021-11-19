@java.lang.Override
public synchronized void queueInput(org.mozilla.gecko.media.Sample sample) throws android.os.RemoteException {
    if (!(mInputProcessor.onSample(sample))) {
        reportError(org.mozilla.gecko.media.Codec.Error.FATAL, new java.lang.Exception("FAIL: input sample queue is full"));
    }
}