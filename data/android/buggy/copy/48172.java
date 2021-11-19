public java.lang.String getExpirationFormattedForApp() {
    java.text.SimpleDateFormat dateFormatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
    java.lang.String formattedDate = "";
    if ((mExpiration) != null) {
        dateFormatter.format(mExpiration);
    }
    return formattedDate;
}