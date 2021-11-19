public void extendTime(int minutes) {
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.setTime(new java.util.Date());
    c.add(java.util.Calendar.MINUTE, minutes);
    buildOffEnd = c.getTime();
}