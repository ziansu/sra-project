public boolean isRecoverFromExceptions() {
    java.lang.String setting = getSetting("recover-from-exceptions");
    if (setting == null) {
        return false;
    }else {
        return setting.equalsIgnoreCase("true");
    }
}