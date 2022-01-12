public boolean remove(edu.auburn.eng.csse.comp3710.team8.Palette p) {
    java.lang.String temp = colorsToString(p);
    database.delete(DBManager.TABLE_PALETTES, (((DBManager.COLUMN_COLORS) + " = ") + temp), null);
    return true;
}