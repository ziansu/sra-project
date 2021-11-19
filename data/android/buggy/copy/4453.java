@java.lang.Override
public void onStatusUpdated() {
    if ((this.onMediaUpdatedListener) != null) {
        this.onMediaUpdatedListener.onMediaUpdated(this.createMediaObject());
    }
}