@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    rememberEulaAccepted(context);
    login(serverText.toString(), usernameEditText.toString(), passwordEditText.toString());
}