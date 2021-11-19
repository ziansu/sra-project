@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.Intent intent = new android.content.Intent();
    setResult(com.myhitchhikingspots.RESULT_CANCELED, intent);
    finish();
}