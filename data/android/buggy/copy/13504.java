private static void closeDB() {
    if ((com.mozzandroidutils.sqlite.MozzDB.mDatabase) != null) {
        if (com.mozzandroidutils.sqlite.MozzDB.mDatabase.isOpen()) {
            com.mozzandroidutils.sqlite.MozzDB.mDatabase.close();
            com.mozzandroidutils.sqlite.MozzDB.mDatabase = null;
        }else {
            com.mozzandroidutils.sqlite.MozzDB.mDatabase = null;
        }
    }
}