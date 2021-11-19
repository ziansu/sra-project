@java.lang.Override
public void onBackPressed() {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.example.stairs.MainActivity.class);
    startActivity(intent);
    this.finish();
    init();
}