@java.lang.Override
public void onNext(com.infinote.differentthinking.infinote.models.base.UserContract value) {
    view.notifySuccessful();
    view.showListNotesActivity();
}