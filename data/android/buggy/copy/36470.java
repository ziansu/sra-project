public void enableBold(boolean isValid) {
    if ((getSelectionStart()) < (getSelectionEnd()))
        setSelectionTextBold(isValid);
    else
        state.enableBold(isValid);
    
}