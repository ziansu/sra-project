@java.lang.Override
public double getTemperature() {
    java.lang.String res;
    try {
        res = requestAndWaitForResponse("TEMP");
    } catch (java.io.IOException e) {
        return -300;
    }
    return res == null ? -300 : java.lang.Double.valueOf(res);
}