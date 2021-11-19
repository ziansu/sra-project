@java.lang.Override
protected void onResume() {
    android.util.Log.v(szu.bdi.hybrid.demo.MainActivity.LOGTAG, ".onResume()");
    super.onResume();
    synchronized(szu.bdi.hybrid.demo.MainActivity._is_main_init) {
        if ((szu.bdi.hybrid.demo.MainActivity._is_main_init) == false) {
            szu.bdi.hybrid.demo.MainActivity._is_main_init = true;
            fwdToMain();
        }else {
        }
    }
}