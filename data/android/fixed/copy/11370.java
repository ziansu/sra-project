@java.lang.Override
public boolean onFail(int statusCode, @android.support.annotation.Nullable
T failDate, @android.support.annotation.Nullable
java.lang.Throwable error) {
    return ((mResponseCallback) != null) && (mResponseCallback.onFail(statusCode, failDate, error));
}