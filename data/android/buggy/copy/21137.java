@java.lang.Override
public void run() {
    org.matrix.matrixandroidsdk.activity.CommonActivityUtils.goToRoomPage(this.mAutomaticallyOpenedRoomId, this, mOpenedRoomIntent);
    this.mAutomaticallyOpenedRoomId = null;
    this.mOpenedRoomIntent = null;
}