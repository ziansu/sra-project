@java.lang.Override
public void call(com.i906.mpt.prayer.PrayerContext prayer) {
    mIsLoading.set(false);
    mIsError.set(false);
    mPrayerStream.onNext(prayer);
}