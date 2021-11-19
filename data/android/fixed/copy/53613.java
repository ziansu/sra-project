@java.lang.Override
public long receivePower(long microJoules, boolean simulate) {
    return battery.addPowerChecking(microJoules, simulate);
}