@java.lang.Override
public boolean logJSON(java.util.Collection<java.lang.String> events) {
    boolean ret = true;
    for (java.lang.String event : events) {
        ret = logJSON(event);
        if (!ret) {
            break;
        }
    }
    return false;
}