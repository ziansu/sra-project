@java.lang.Override
public void run() {
    repository.delete();
    mApp.resetStoredRepoId();
    com.example.dinok.gitstats.MainActivity.AsyncTaskRunner astr = new com.example.dinok.gitstats.MainActivity.AsyncTaskRunner();
    astr.execute(" ");
    swipeLayout.setRefreshing(false);
}