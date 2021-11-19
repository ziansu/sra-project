public void startNoInterventionService() {
    stopAllServices(false);
    android.util.Log.d(Constants.TAG, "NoIntervention started");
    kr.ac.kaist.nmsl.pushmanager.util.Util.writeLogToFile(this, Constants.LOG_NAME, "START", "==============NoIntervention started===============");
}