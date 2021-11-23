@java.lang.Override
public boolean isPasswordMasked() {
    return "password".equals(passwordField.getAttribute("type"));
}