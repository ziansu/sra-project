@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.xyf.MyApp.DBUtils.getInstances().initDB(this);
}