public boolean prepareToSave() {
    if (!(validateForm())) {
        return false;
    }
    configureOscSenderFromForm();
    configureOutputManagerFromForm();
    return true;
}