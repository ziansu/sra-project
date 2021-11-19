@java.lang.Override
public void run() {
    tv.setText("start");
    setNotification(downloadTask.getFileName(), ("Will start to download counter " + (counter)), java.lang.Integer.parseInt(downloadTask.getId()));
}