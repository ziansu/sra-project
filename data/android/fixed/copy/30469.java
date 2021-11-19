@java.lang.Override
public void onClick(android.view.View v) {
    com.jady.retrofitclient.download.DownloadManager.getInstance().remove(downloadInfo);
    downloadInfoList.remove(downloadInfo);
    notifyDataSetChanged();
}