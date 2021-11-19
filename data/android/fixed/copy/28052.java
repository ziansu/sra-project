public static void safeSleep(int delay) {
    try {
        java.lang.Thread.sleep(delay);
    } catch (java.lang.Exception e) {
    }
}