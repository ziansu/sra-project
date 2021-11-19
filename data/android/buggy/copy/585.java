@java.lang.Override
public void onRefresh() {
    android.widget.Toast.makeText(activity, "refreshed!", Toast.LENGTH_SHORT).show();
    refreshPingList();
}