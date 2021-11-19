@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onPoisAndNotesDownloadedEvent(io.mapsquare.osmcontributor.core.events.PoisAndNotesDownloadedEvent event) {
    mapFragment.showProgressBar(false);
    forceRefreshPoi = true;
    loadPoisIfNeeded();
}