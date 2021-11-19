protected boolean specificShowError(int messageId) {
    switch (getErrorType(messageId)) {
        case USERNAME :
        case PASSWORD :
            showUsernameError(messageId);
            showPasswordError(messageId);
            return true;
        default :
            return false;
    }
}