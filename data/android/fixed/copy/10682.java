@java.lang.Override
public void onComplete() {
    if (done) {
        return ;
    }
    done = true;
    io.reactivex.internal.operators.OperatorScanSeed.ScanSeedSubscriber.drain(false);
}