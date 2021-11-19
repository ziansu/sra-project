private java.lang.String getLastUpdatedTime() {
    try {
        java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat("dd.MM.yyyy HH:mm");
        return formater.format(mLastUpdated);
    } catch (java.lang.Throwable t) {
        return null;
    }
}