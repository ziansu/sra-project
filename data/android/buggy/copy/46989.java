@java.lang.Override
public void onPause() {
    super.onPause();
    com.taibah.busservice.MainActivity.isHomeFragmentOpen = false;
    if ((com.taibah.busservice.utils.AppGlobals.getUserType()) == 0) {
        mTask.cancel(true);
    }
}