@java.lang.Override
public void run() {
    if (o != null) {
        cs = ((me.eycia.msghub_android.ChanInfo[]) (o));
        mAllChans.Update(cs);
        mSlidingTabLayout.setViewPager(mViewPager);
    }
}