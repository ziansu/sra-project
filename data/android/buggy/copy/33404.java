public void startNoInterventionService() {
    stopAllServices(false);
    startService(new android.content.Intent(this, kr.ac.kaist.nmsl.pushmanager.activity.StepCounterService.class));
    android.util.Log.d(Constants.TAG, "NoIntervention started");
    kr.ac.kaist.nmsl.pushmanager.util.Util.writeLogToFile(this, Constants.LOG_NAME, "START", "==============NoIntervention started===============");
}