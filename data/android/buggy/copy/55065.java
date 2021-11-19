@java.lang.Override
public void onDestroy() {
    android.util.Log.w("TopicsFragment:Destroy", "I am here");
    super.onDestroy();
    topicsData = null;
}