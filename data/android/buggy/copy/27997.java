private void handleThemeActivated(@android.support.annotation.NonNull
org.wordpress.android.fluxc.store.ThemeStore.ActivateThemePayload payload) {
    org.wordpress.android.fluxc.store.ThemeStore.OnThemeActivated event = new org.wordpress.android.fluxc.store.ThemeStore.OnThemeActivated(payload.site, payload.theme);
    if (payload.isError()) {
        event.error = payload.error;
    }
    emitChange(event);
}