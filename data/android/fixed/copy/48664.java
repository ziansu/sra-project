@java.lang.Override
public void onLoginFailed() {
    for (agency.tango.skald.core.listeners.AuthErrorListener authErrorListener : authErrorListeners) {
        authErrorListener.onAuthError(getAuthError());
    }
}