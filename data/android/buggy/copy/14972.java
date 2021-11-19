@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    ((de.appphil.categories.CategoriesApplication) (getApplication())).setOwnParticipantId();
    finish();
}