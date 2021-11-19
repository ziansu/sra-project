@java.lang.Override
public void onLocationStoppedSeeking() {
    android.util.Log.d("LOCATION", "Tracking stopped");
    com.unity3d.player.UnityPlayer.UnitySendMessage("LOCATIONCHECKER", "OnLocationStoppedSeeking", "");
}