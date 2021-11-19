@java.lang.Override
public boolean isPowered(int plugTypeSet) {
    synchronized(mLock) {
        return isPoweredLocked(plugTypeSet);
    }
}