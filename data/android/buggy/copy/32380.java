@java.lang.Override
public void navigate(java.lang.Class<?> cls) {
    android.content.Intent intent = new android.content.Intent(this, cls);
    startActivityForResult(intent, com.kareem.mynursery.MainActivity.LOGIN_ACTIVITY_RESULT_CODE);
}