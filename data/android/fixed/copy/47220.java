@java.lang.Override
public void onError(java.lang.Throwable throwable) {
    timber.log.Timber.e(throwable, "Could not initialize player: %s", throwable.getMessage());
}