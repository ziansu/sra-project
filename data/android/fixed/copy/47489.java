private java.util.ArrayList<Experiment> getExperiments(java.lang.String cameraId) {
    return new DBQuery().getExperiments(cameraId);
}