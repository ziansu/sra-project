public void progressWait(final java.util.function.BooleanSupplier condition) {
    while (condition.getAsBoolean()) {
        callProgress(1);
        io.reactivex.Observable.timer(pluginConfig.zorroProgressInterval(), java.util.concurrent.TimeUnit.MILLISECONDS, io.reactivex.schedulers.Schedulers.io()).blockingFirst();
    } 
}