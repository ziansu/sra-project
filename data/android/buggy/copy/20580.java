@java.lang.Override
public void setEpisode(@android.support.annotation.NonNull
org.bottiger.podcast.provider.IEpisode argItem) {
    super.setEpisode(argItem);
    try {
    } catch (java.lang.IllegalArgumentException iae) {
    }
    setState(calcState());
    setProgressPercent(new org.bottiger.podcast.listeners.DownloadProgress());
}