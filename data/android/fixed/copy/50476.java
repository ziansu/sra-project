@java.lang.Override
public void onSuccess(java.lang.String roomId) {
    if (null != roomId) {
        org.matrix.matrixandroidsdk.activity.CommonActivityUtils.goToRoomPage(null, roomId, this, null);
    }
}