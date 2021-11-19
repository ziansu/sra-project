@java.lang.Override
public void onClick(android.view.View v) {
    if (v.equals(register)) {
        startRegistration();
    }else
        if (v.equals(login)) {
            startMenu();
        }
    
}