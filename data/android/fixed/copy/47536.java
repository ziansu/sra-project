@java.lang.Override
public void onLoginSuccess() {
    android.content.Intent i = new android.content.Intent(this, gem.training3.enterprisenetwork.screen.main.MainActivity.class);
    startActivity(i);
    finish();
}