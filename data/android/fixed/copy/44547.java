public void setProgressChangeListeners(java.util.concurrent.CopyOnWriteArrayList<com.mapbox.services.android.navigation.v5.listeners.ProgressChangeListener> progressChangeListeners) {
    progressChangeListeners.add(this);
    locationUpdatedThread.setProgressChangeListener(progressChangeListeners);
    this.progressChangeListeners = progressChangeListeners;
}