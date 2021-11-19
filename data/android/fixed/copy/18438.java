@java.lang.Override
public void onSessionResumed(com.google.android.gms.cast.framework.CastSession session, boolean wasSuspended) {
    onApplicationConnected(session);
}