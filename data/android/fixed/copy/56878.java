@java.lang.Override
public void noiseSensorDataReady(long timestamp, float rms, float spl, float[] bands) {
    noiseReading = new ch.ethz.soms.nervous.competition.model.NoiseReading(spl, timestamp, team);
    android.util.Log.d(ch.ethz.soms.nervous.competition.SensorService.DEBUG_TAG, "Noise data collected");
}