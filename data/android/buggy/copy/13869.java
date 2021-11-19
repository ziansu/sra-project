private void reloadTimeline() {
    android.util.Log.d("Reload", "Reloading timeline");
    this.adapter.refresh(this.timelineRefreshCallback);
}