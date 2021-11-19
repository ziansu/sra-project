@java.lang.Override
public void onComplete() {
    done = true;
    io.reactivex.internal.operators.OperatorScanSeed.ScanSeedSubscriber.drain(false);
}