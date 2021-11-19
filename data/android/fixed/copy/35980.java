@java.lang.Override
public synchronized void queueInput(org.mozilla.gecko.media.Sample sample) throws android.os.RemoteException {
    mInputProcessor.onSample(sample);
}