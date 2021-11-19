@com.google.firebase.database.Exclude
public void setCleaner(java.lang.String id) {
    if ((cleaners) != null) {
        cleaners.put(id, true);
    }
}