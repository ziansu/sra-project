@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.buttonLogin :
            java.lang.System.out.println("Login");
            handleLogin(getUserManager().login("", ""));
            break;
    }
}