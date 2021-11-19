public static void create(int id, java.lang.String name, java.util.Date created) {
    new models.Category(id, name).save();
}