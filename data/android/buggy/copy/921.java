@java.lang.Override
public void run() {
    com.jrdcom.systrace.service.AtraceService.sAtraceRunning = false;
    freezeIcon(false);
    if (!isOK) {
        showToast(failToast);
    }else {
        showLongToast((((pathToast) + (com.jrdcom.systrace.service.AtraceService.sDesiredStoragePath)) + "/"));
    }
}