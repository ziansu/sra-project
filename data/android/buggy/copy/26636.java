@java.lang.Override
public boolean isPageComplete() {
    if (mailBox.getText().isEmpty()) {
        return false;
    }
    if (passwordBox.getText().isEmpty()) {
        return false;
    }
    return true;
}