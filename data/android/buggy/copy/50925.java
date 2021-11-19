@java.lang.Override
public void onStop() {
    super.onStop();
    android.util.Log.w("STATE 4", "ONSTOP");
    com.example.yunita.reflexsimulator.ReactionTimer.isDismiss = false;
}