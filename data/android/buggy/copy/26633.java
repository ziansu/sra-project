public static void printCounterExample(rebeca.wrebeca.common.GlobalState gl, int stNum) {
    java.lang.StringBuffer str = new java.lang.StringBuffer();
    rebeca.wrebeca.common.Trans.createCounterExample(gl, stNum, str, new java.util.HashSet<>());
}