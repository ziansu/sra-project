@java.lang.Override
public void run() {
    android.content.Intent login2 = new android.content.Intent(this, at.sw2017.xp4.hobit.FacebookLogin.class);
    startActivityForResult(login2, 1);
}