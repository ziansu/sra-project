public static com.google.firebase.database.FirebaseDatabase getDatabase() {
    if ((com.irene.fintrip.Utils.DatabaseUtil.mDatabase) == null) {
        android.util.Log.e("DEBUG", "new DB instance");
        com.google.firebase.database.FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        com.irene.fintrip.Utils.DatabaseUtil.mDatabase = com.google.firebase.database.FirebaseDatabase.getInstance();
    }
    return com.irene.fintrip.Utils.DatabaseUtil.mDatabase;
}