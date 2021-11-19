public void appendToUserLog(java.lang.String str) {
    try {
        userLog.write(str);
        userLog.flush();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}