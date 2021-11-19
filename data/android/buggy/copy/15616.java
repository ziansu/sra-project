public void selectField(java.lang.String column, java.lang.String pattern, com.angkorteam.framework.extension.share.provider.Calendar calendar) {
    this.pattern.put(column, pattern);
    this.calendar.put(column, calendar);
    selectField(java.util.Date.class, column);
}