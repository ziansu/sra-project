public java.lang.String getUrl() {
    int millisecond = java.util.Calendar.getInstance().get(java.util.Calendar.MILLISECOND);
    return ((url) + "?") + millisecond;
}