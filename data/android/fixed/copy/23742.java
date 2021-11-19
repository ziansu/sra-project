public void extendTime(int minutes) {
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.setTime(buildOffEnd);
    c.add(java.util.Calendar.MINUTE, minutes);
    buildOffEnd = c.getTime();
}