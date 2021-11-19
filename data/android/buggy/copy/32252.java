@java.lang.Override
public void onClick(android.view.View v) {
    this.finish();
    overridePendingTransition(R.anim.open_main, R.anim.close_next);
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.nrct.application.main.NrctMainActivity.class);
    startActivity(intent);
}