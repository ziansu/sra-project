public void onBackPressed() {
    com.mercadopago.mptracker.MPTracker.getInstance().trackEvent("ADDITIONAL_STEP_VAULT_ACTIVITY", "BACK_PRESSED", "2", mPublicKey, BuildConfig.VERSION_NAME, getResourcesProvider().getContext());
    state = state.onBackPressed(this);
}