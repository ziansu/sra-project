public void setObject(int index, java.lang.Object value) {
    org.apache.commons.lang.Validate.isTrue(hasIndex(index), "You cannot register objects without the watcher object!");
    setObject(index, null, value);
}