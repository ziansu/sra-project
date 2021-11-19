public datastructures.AttributeJoint getKey(int index) {
    try {
        return this.keys.get(index);
    } catch (java.lang.IndexOutOfBoundsException ex) {
        datastructures.KeyJoint.LOG.log(java.util.logging.Level.INFO, ex.getMessage(), ex);
    }
    return null;
}