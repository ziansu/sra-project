public void inspect(java.lang.Object obj, boolean recursive) {
    try {
        objectClass = obj.getClass();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}