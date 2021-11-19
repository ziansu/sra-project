private java.lang.String methodPassOrFail(java.lang.reflect.Method m, java.lang.Object o) {
    boolean wasMade = simpleMethodInvoke(m, o);
    java.lang.System.out.println(wasMade);
    java.lang.String methodResult = "FAIL";
    if (wasMade) {
        methodResult = "PASS";
    }
    return methodResult;
}