public static de.htwberlin.f4.ai.ma.measurement.IndoorMeasurement getIndoorMeasurement(android.content.Context context) {
    if ((de.htwberlin.f4.ai.ma.measurement.IndoorMeasurementFactory.indoorMeasurement) == null) {
        de.htwberlin.f4.ai.ma.measurement.IndoorMeasurementFactory.indoorMeasurement = new de.htwberlin.f4.ai.ma.measurement.IndoorMeasurementImpl(context);
    }
    return de.htwberlin.f4.ai.ma.measurement.IndoorMeasurementFactory.indoorMeasurement;
}