@java.lang.Override
public void onLoginSuccess(studios.codelight.smartloginlibrary.users.SmartUser user) {
    android.widget.Toast.makeText(this, user.toString(), Toast.LENGTH_SHORT).show();
    refreshLayout();
}