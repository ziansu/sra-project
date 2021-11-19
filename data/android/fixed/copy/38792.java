@java.lang.Override
public void forkContacts(android.content.Context context, int quantity, boolean allTypes) {
    if ((mForkBinder) != null) {
        mForkBinder.startFork((allTypes ? com.pioneer.aaron.dolly.fork.ForkTask.FORK_TYPE_ALL_TYPE_CONTACT : com.pioneer.aaron.dolly.fork.ForkTask.FORK_TYPE_RANDOM_CONTACT), quantity);
    }
}