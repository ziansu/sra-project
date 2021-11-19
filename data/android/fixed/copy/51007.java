@java.lang.Override
public void onRetry() {
    try {
        joinRoom(roomIdOrAlias, params, callback);
    } catch (java.lang.Exception e) {
        android.util.Log.e(org.matrix.androidsdk.rest.client.RoomsRestClient.LOG_TAG, ("resend joinRoomByAlias : failed " + (e.getMessage())));
    }
}