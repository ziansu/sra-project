@java.lang.Override
public void onDestroy() {
    metronome.stop();
    metronome = null;
    android.util.Log.i(com.example.vitalykulyk.metronom.MetronomService.TAG, "Service onDestroy");
}