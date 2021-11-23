public void export(java.lang.String path) {
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.set(0, 0, 0);
    export(path, c.getTime(), new java.util.Date());
}