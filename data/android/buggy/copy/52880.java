public java.util.Set<project.data.Measurement> getMeasurementToSend() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    return getMeasurementManager().getMeasurementsToSend();
}