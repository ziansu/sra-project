@java.lang.Override
public void setEpisode(@android.support.annotation.NonNull
org.bottiger.podcast.provider.IEpisode argItem) {
    super.setEpisode(argItem);
    setState(calcState());
    setProgressPercent(new org.bottiger.podcast.listeners.DownloadProgress());
}