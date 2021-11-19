public void pauseDrawState(boolean flag) {
    if (flag) {
        pasuseCurrentVideo(true);
        mMapView.onPause();
    }else {
        pasuseCurrentVideo(false);
        mMapView.onResume();
        bringChildToFront(mMapView);
    }
}