public static java.util.Date parseDate(java.lang.String date) {
    try {
        return com.rajkovski.toni.transportdemo.util.DateTimeUtil.INPUT_FORMAT.parse(date);
    } catch (java.text.ParseException e) {
        com.rajkovski.toni.transportdemo.logger.Logger.w(com.rajkovski.toni.transportdemo.util.DateTimeUtil.LOG_TAG, ("Cannot parse date " + date));
        return null;
    }
}