@java.lang.Override
public void run() {
    if (o != null) {
        final me.eycia.msghub_android.ChanInfo[] cs = ((me.eycia.msghub_android.ChanInfo[]) (o));
        mAllChans.Update(cs);
        mSlidingTabLayout.setViewPager(mViewPager);
    }
}