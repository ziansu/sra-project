@java.lang.Override
public void run() {
    if (com.unit5app.utils.Utils.hadInternetOnLastCheck) {
        if ((rssReaders.length) > 0) {
            newsTask.setReaders(rssReaders);
            newsTask.execute();
        }
    }
}