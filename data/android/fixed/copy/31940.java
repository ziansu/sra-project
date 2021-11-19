@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN)
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case 1 :
            wrongPasswordAlert.setVisibility(View.GONE);
            passwordInput.setText("");
            break;
        default :
            break;
    }
}