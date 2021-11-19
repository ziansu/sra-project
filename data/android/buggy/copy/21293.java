private void initThrowableClass(java.lang.Class<?> e) {
    throwableClass.add(e.getName());
    if ((e.getClass().getSuperclass()) != null) {
        initThrowableClass(e.getSuperclass());
    }
}