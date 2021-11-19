@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.sensorberg.SensorbergApplicationBootstrapper.getComponent().inject(this);
    Logger.log.logServiceState("onCreate");
    net.danlew.android.joda.JodaTimeAndroid.init(this);
}