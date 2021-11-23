@java.lang.Override
public boolean writeEvent(final de.grau.organizer.classes.Event event) {
    realm.beginTransaction();
    realm.copyToRealmOrUpdate(event);
    realm.commitTransaction();
    return false;
}