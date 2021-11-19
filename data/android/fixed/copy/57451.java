@java.lang.Override
public void run() {
    final com.metar.android.singleton.ApplicationSingleton app = ((com.metar.android.singleton.ApplicationSingleton) (getApplication()));
    app.setSatelliteStatusEnum(SatelliteStatusEnum.REPORT_IN_QUEUE);
}