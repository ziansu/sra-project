@com.google.firebase.database.Exclude
public void setCleaner(java.lang.String id) {
    if ((cleaners) == null) {
        cleaners = new java.util.HashMap<java.lang.String, java.lang.Boolean>();
    }
    cleaners.put(id, true);
}