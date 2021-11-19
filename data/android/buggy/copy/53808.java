@java.lang.Override
public double getAltitude() {
    java.lang.String res;
    try {
        res = requestAndWaitForResponse("ALTI");
    } catch (java.io.IOException e) {
        return -1;
    }
    return java.lang.Double.valueOf(res);
}