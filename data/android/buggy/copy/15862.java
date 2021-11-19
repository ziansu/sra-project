@java.lang.Override
protected void onResume() {
    super.onResume();
    switch (u2fTokenIntentType) {
        case U2F_OPERATION_REG :
            register();
            break;
        case U2F_OPERATION_SIGN_BATCH :
            sign();
    }
}