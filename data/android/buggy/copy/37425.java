public void trackScreen() {
    com.mercadopago.mptracker.MPTracker.getInstance().trackScreen("ENTITY_TYPE_ACTIVITY", "2", mEntityTypePresenter.getPublicKey(), BuildConfig.VERSION_NAME, this);
}