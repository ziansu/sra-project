@java.lang.Override
public void onDestroy() {
    com.erpdevelopment.vbvm.service.DownloadAllService.stopped = false;
    java.lang.System.out.println("DownloadAllService.onDestroy");
    super.onDestroy();
}