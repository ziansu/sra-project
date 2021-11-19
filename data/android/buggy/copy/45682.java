private void onSeatClicked(T seat) {
    if ((mClickListener) != null) {
        mClickListener.onSeatClicked(seat);
    }
    if ((mEventMap) != null) {
        mEventMap.updateColor(seat);
    }
    com.ykrapiva.eventmap.EventMapView.requestRender();
}