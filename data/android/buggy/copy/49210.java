private boolean isLocaleAlreadyChosen(ua.fantotsy.controllers.ISessionRequestWrapper wrapper) {
    return (wrapper.getSessionAttribute("language")) == null;
}