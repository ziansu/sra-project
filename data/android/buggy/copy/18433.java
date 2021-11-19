public boolean setParameter(java.lang.String name, java.lang.String[] args) {
    try {
        curEntity.setParameter(name, args);
        return true;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
}