@java.lang.Override
public void onShutter() {
    android.util.Log.e("ApplicationScreen", "onShutter");
    com.almalence.opencam.ApplicationScreen.getPluginManager().onShutter();
}