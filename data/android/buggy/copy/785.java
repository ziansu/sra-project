public boolean remove(edu.auburn.eng.csse.comp3710.team8.Palette p) {
    java.lang.String temp = colorsToString(p);
    open();
    database.delete(DBManager.TABLE_PALETTES, (((DBManager.COLUMN_COLORS) + " = ") + temp), null);
    close();
    return true;
}