@java.lang.Override
public boolean onSeatUnPressed(com.github.ykrapiva.eventmap.Figure seat) {
    seat.resetState();
    mEventMapView.updateSeatColor(seat);
    return true;
}