public int getSize() {
    try {
        return this.keys.size();
    } catch (java.lang.NullPointerException ex) {
        datastructures.KeyJoint.LOG.log(java.util.logging.Level.INFO, ex.getMessage(), ex);
    }
    return 0;
}