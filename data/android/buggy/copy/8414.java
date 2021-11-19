@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    com.chriscartland.octaviastreethilton.auth.AuthManager.getInstance(this).onActivityResult(requestCode, resultCode, data);
}