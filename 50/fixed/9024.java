@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    android.content.Intent intent = new android.content.Intent(this, com.example.mrides.MainActivity.class);
    startActivity(intent);
}