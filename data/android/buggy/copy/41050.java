private void startTrackService() {
    com.kivsw.forjoggers.TrackingService.start(getActivity());
    com.kivsw.forjoggers.CurrentTrack.getInstance(getActivity()).clear();
    onStartStopTrackingService(true);
}