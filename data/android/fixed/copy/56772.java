@java.lang.Override
public void onTerminate() {
    super.onTerminate();
    if (me.xiaonian.mowidroid.kit.ApplicationKit.isMainProcess(this)) {
        getTerminator().terminate();
    }
}