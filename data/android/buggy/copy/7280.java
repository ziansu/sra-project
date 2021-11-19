public void setTax(float tax) {
    sqLiteDatabase = dbHelper.getWritableDatabase();
    dbHelper.setTax(tax, sqLiteDatabase);
}