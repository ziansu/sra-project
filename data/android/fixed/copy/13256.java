@java.lang.Override
public double getMissRate() {
    return (getRequestCount()) > 0 ? ((getMissCount()) * 1.0) / (getRequestCount()) : 0;
}