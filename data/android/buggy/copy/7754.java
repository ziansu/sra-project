@java.lang.Override
public boolean isPasswordMasked() {
    return passwordField.getAttribute("type").equals("password");
}