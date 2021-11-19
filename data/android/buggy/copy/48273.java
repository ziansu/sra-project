@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    update_storage();
    android.content.Intent intent = new android.content.Intent(this, com.example.matheus.taskbar.MainActivity.class);
    startActivity(intent);
    finishAffinity();
}