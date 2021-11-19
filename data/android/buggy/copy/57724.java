@java.lang.Override
public boolean onSeatPressed(com.github.ykrapiva.eventmap.Figure seat) {
    switch (seat.getState()) {
        case AVAILABLE :
            seat.setState(Figure.State.PRESSED);
            break;
    }
    mEventMapView.updateSeatColor(seat);
    return true;
}