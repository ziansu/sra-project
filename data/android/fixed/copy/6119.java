public void exit() {
    net.qiujuer.tips.factory.cache.Cache.destroy();
    for (android.app.Activity activity : mActivities) {
        if (!(activity.isFinishing()))
            activity.finish();
        
    }
}