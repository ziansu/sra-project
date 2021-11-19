@java.lang.Override
public void onDestroy() {
    android.util.Log.d(com.cn6000.callrec.CallRecorderService.TAG, "service destory");
    this.stopRecording();
    this.cntx = null;
    super.onDestroy();
}