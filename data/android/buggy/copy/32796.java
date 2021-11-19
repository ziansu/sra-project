@java.lang.Override
public void run() {
    if (dl.needToDownload()) {
        pool.add(dl);
    }
}