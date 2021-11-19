@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    setResult(eic.beike.projectx.android.activities.RESULT_CANCELED);
    finish();
}