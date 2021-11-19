public static <T> T handleExceptionAndReturnNull(org.slf4j.Logger log, java.lang.Exception e, java.lang.String method, java.lang.Object... params) {
    kr.jm.utils.exception.JMExceptionManager.logException(log, e, method, params);
    return null;
}