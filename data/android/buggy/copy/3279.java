private java.util.List<eschoepf.flickrs10.Picture> getAllPictures() {
    return com.raizlabs.android.dbflow.sql.language.SQLite.select().from(eschoepf.flickrs10.Picture.class).queryList();
}