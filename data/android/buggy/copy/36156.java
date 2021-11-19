@java.lang.Override
public void run() {
    cc.openframeworks.OFAndroid.enableTouchEvents();
    cc.openframeworks.OFAndroid.enableOrientationChangeEvents();
    glView.onResume();
    synchronized(OFAndroidObject.ofObjects) {
        for (cc.openframeworks.OFAndroidObject object : OFAndroidObject.ofObjects) {
            object.onResume();
        }
    }
}