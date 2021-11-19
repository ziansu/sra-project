@java.lang.Override
public void onValidStart() {
    com.mercadopago.mptracker.MPTracker.getInstance().trackScreen("ADDITIONAL_STEP_VAULT_ACTIVITY", "2", mPresenter.getPublicKey(), BuildConfig.VERSION_NAME, this);
    mPresenter.checkFlow();
}