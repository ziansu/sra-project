@java.lang.Override
public boolean hasNext() {
    if (((java.lang.Double.compare(((current) + (increment)), upLimit)) > 0) || ((metricType) == null)) {
        return false;
    }
    return true;
}