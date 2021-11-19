@java.lang.Override
public java.util.Calendar getModelValue(java.lang.Long data) {
    if (data != null) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(data);
        return calendar;
    }else {
        return null;
    }
}