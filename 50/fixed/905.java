@java.lang.Override
public void createDesire(@android.support.annotation.NonNull
de.fau.cs.mad.wanthavers.common.Desire desire, @android.support.annotation.NonNull
wanthavers.mad.cs.fau.de.wanthavers_android.data.source.desire.CreateDesireCallback callback) {
    try {
        de.fau.cs.mad.wanthavers.common.Desire ret = desireClient.createDesire(desire);
        callback.onDesireCreated(ret);
    } catch (java.lang.Throwable t) {
        callback.onCreateFailed();
    }
}