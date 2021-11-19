@java.lang.Override
public void onSubscribe(@io.reactivex.annotations.NonNull
io.reactivex.disposables.Disposable d) {
    timber.log.Timber.d("onSubscribe, url: %s, requestId: %d", url, requestId);
}