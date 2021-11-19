@java.lang.Override
public void onSuccess(@android.support.annotation.Nullable
java.util.List<T> data) {
    mDataCache.clear();
    if (data != null) {
        mDataCache.addAll(data);
    }
    callback.onSuccess(mDataCache);
}