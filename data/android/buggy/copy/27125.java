@java.lang.Override
public void onFinish() {
    android.content.Intent homeIntent = new android.content.Intent(this, com.google.zach.OnTargetFencing.HomeScreen.class);
    homeIntent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    homeIntent.putExtra("finished", true);
    homeIntent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    startActivityIfNeeded(homeIntent, 0);
}