@java.lang.Override
public void run() {
    synchronized(mLock) {
        if ((mTransport) == null) {
            return ;
        }
    }
    this.onChange(mSelfChange, mUri, mUserId);
}