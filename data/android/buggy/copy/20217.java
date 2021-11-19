@java.lang.Override
public void onStop() {
    picturePreference.setSelfUser(null);
    getControllerFactory().getAccentColorController().removeAccentColorObserver(this);
    getStoreFactory().getProfileStore().removeProfileStoreObserver(this);
    super.onStop();
}