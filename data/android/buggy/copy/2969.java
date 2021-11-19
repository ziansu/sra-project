@java.lang.Override
public void run() {
    finish();
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.example.domjonathan.webviewteste.TalaUnicaActivity.class);
    startActivity(intent);
}