public void setValue(boolean global, long nb) {
    if (nb >= 0) {
        if (global) {
            fNbEvents = nb;
        }else {
            fNbEventsInTimeRange = nb;
        }
    }
}