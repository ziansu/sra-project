@java.lang.Override
public void recreate() {
    if ((android.os.Build.VERSION.SDK_INT) >= 11) {
        super.recreate();
    }else {
        startActivity(getIntent());
        finish();
    }
}