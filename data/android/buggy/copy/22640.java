@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.tianyl.android.offlinereader.sync.SyncService.addLog("onCreate");
    articleDBUtil = new com.tianyl.android.offlinereader.dao.ArticleDBUtil(this);
}