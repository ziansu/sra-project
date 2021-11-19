@java.lang.Override
public void onStop() {
    getControllerFactory().getAccentColorController().removeAccentColorObserver(this);
    getStoreFactory().getProfileStore().removeProfileStoreObserver(this);
    super.onStop();
}