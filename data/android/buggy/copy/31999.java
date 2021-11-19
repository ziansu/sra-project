public static void insertChild(java.lang.String name, java.lang.String photo) {
    com.raizlabs.android.dbflow.sql.language.SQLite.insert(com.example.a1.projecttest.Entities.ChildEntity.class).columns("name", "photo", "selected").values(name, photo, View.GONE).execute();
}