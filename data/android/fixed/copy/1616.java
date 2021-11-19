public static java.lang.String dateTime2StringFS(java.util.Date date) {
    if (date == null) {
        date = new java.util.Date();
    }
    return com.rockagen.commons.util.CommUtil.date2String(date, "yyyyMMddHHmmssSSS");
}