@java.lang.Override
public void setup() {
    try {
        md = java.security.MessageDigest.getInstance("MD5");
    } catch (java.lang.Exception e) {
        org.apache.drill.exec.expr.fn.impl.CryptoFunctions.logger.debug(e.getMessage());
    }
}