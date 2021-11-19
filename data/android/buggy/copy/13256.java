@java.lang.Override
public double getMissRate() {
    return ((getMissCount()) * 1.0) / (getRequestCount());
}