@java.lang.Override
public void finish() {
    if (mHasSceneTransition) {
        finishAfterTransition();
        mHasSceneTransition = false;
    }else {
        ds.framework.v4.io.ConnectionChecker.getInstance().unregisterReceiver(this);
        ds.framework.v4.Global.onActivityDestroyed(this);
        super.finish();
    }
}