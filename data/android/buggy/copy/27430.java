@java.lang.Override
public void onClick(android.view.View view) {
    loadToast.setText("LOADING");
    loadToast.show();
    attemptLogin();
}