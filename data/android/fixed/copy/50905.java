@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.cancel();
    startActivity(new android.content.Intent(getApplicationContext(), com.example.kapayakatongo.bikenapped.MapActivity.class));
    finish();
}