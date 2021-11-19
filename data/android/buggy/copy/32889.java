@java.lang.Override
public void finish() {
    android.content.Intent sendIntent = new android.content.Intent();
    sendIntent.putExtra("event", event);
    setResult(fr.insapp.insapp.activities.RESULT_OK, sendIntent);
    super.finish();
}