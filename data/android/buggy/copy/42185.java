public synchronized java.lang.String retrieve() {
    return msgs.remove(((msgs.size()) - 1));
}