private void calculateApps() {
    for (com.itheima.mobilesafe.utils.objects.AppInfo appInfo : appInfos) {
        if (appInfo.isUserApp())
            (userAppsCount)++;
        else
            (sysAppsCount)++;
        
    }
}