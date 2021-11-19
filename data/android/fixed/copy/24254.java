private static int writeResult(java.lang.String file, java.lang.String sql) {
    try {
        com.realcloud.college2017.ReadTextHelper.appendToFile(file, sql);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
        return -1;
    }
    return 1;
}