protected synchronized void complete(org.wahtod.wififixer.utility.HostMessage h, int session) {
    if (session == (mCurrentSession)) {
        mFinished = true;
        response = h;
        masterThread.interrupt();
    }
}