@java.lang.Override
public void onBackPressed() {
    moveTaskToBack(true);
    overridePendingTransition(0, 0);
}