@java.lang.Override
public void call(java.lang.Throwable throwable) {
    mIsLoading.set(false);
    mIsError.set(true);
    mPrayerStream.onError(throwable);
}