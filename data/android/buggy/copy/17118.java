public static java.util.Date convertAsDate(java.lang.String value) throws java.text.ParseException {
    return de.aw.yacha.database.DBConvert.mSqliteDateFormat.parse(value);
}