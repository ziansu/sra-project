private java.util.Calendar getCurrentDate() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.set(cal.get(java.util.Calendar.YEAR), cal.get(java.util.Calendar.MONTH), cal.get(java.util.Calendar.DATE));
    return cal;
}