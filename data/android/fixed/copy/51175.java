@java.lang.Override
protected void onStart() {
    super.onStart();
    synchronized(szu.bdi.hybrid.demo.MainActivity._is_main_init) {
        if ((szu.bdi.hybrid.demo.MainActivity._is_main_init) == false) {
            szu.bdi.hybrid.demo.MainActivity._is_main_init = true;
            fwdToMain();
        }
    }
    android.util.Log.v(szu.bdi.hybrid.demo.MainActivity.LOGTAG, ".onStart()");
}