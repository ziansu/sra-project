private void runTask() {
    serverhelper.execute(new com.android.tasks.MeasurementTask(context, new java.util.HashMap<java.lang.String, java.lang.String>(), new com.android.services.PerformanceService.MeasurementListener()));
}