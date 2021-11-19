@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    setResult(eic.beike.projectx.android.activities.RESULT_CANCELED);
    startActivity(new android.content.Intent(this, eic.beike.projectx.android.activities.MenuActivity.class));
    finish();
}