@java.lang.Override
public void onReload(int position) {
    if ((dataReloadCompleted) != null) {
        dataReloadCompleted.onReloadComplete(false);
    }
}