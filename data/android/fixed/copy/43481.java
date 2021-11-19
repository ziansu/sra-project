@java.lang.Override
public void onSeatUnPressed(com.github.ykrapiva.eventmap.Figure seat) {
    seat.resetState();
    mEventMapView.updateSeatColor(seat);
}