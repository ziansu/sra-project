@java.lang.Override
public void run() {
    mPagerAdapter.getFragment(position).startReading(new ominext.com.readmestories.listeners.OnStartedListener() {
        @java.lang.Override
        public void onStart() {
            isMediaPlayerStarted = false;
        }
    });
}