@java.lang.Override
public void onDisconnected(java.lang.String userId, org.webrtc.SurfaceViewRenderer remoteRenderer) {
    presenter.cleanConnection(userId, remoteRenderer);
}