private static java.lang.String getDate(long timeStamp) {
    try {
        java.text.DateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd");
        java.util.Date netDate = new java.util.Date(timeStamp);
        return sdf.format(netDate);
    } catch (java.lang.Exception ex) {
        return "xx";
    }
}