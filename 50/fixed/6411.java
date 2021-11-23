@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, net.biospherecorp.microdoro.MyPreferenceActivity.class);
    startActivityForResult(intent, 1);
}