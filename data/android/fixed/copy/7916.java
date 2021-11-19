@java.lang.Override
public void onDestroy() {
    metronome.stop();
    metronome = null;
    super.onDestroy();
    android.util.Log.i(com.example.vitalykulyk.metronom.MetronomService.TAG, "Service onDestroy");
}