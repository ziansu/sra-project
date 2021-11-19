@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putBoolean("noBt", ((btManager) == null));
    finishActivity(tw.edu.ncku.letsdance.MainActivity.REQUEST_ENABLE_BT);
}