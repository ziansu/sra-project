@java.lang.Override
public void onClick(android.view.View v) {
    if ((getActivity()) instanceof net.osmand.plus.download.DownloadActivity) {
        ((net.osmand.plus.download.DownloadActivity) (getActivity())).setDownloadItem(null);
    }
    dismiss();
}