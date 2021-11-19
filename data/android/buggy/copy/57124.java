@java.lang.Override
public int getCount() {
    if ((departures) == null) {
        return 0;
    }
    return departures.size();
}