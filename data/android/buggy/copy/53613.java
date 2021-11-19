@java.lang.Override
public long receivePower(long microJoules, boolean simulate) {
    if (simulate) {
        if (battery.isFull()) {
            return microJoules;
        }else {
            return 0;
        }
    }
    return battery.addPowerChecking(microJoules);
}