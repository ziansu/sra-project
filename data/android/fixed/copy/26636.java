@java.lang.Override
public boolean isPageComplete() {
    if (mailBox.getText().isEmpty()) {
        return false;
    }else
        if (passwordBox.getText().isEmpty()) {
            return false;
        }
    
    return true;
}