@java.lang.Override
public boolean tryLock() {
    return this.tryLock(ExpireMode.IGNORE, 1000);
}