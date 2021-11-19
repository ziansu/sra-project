@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), dsca.cs.nju.mytabmenudemo.login.LoginActivity.class);
    startActivity(intent);
    finish();
}