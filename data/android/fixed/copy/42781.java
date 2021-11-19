public static void executNonUi(java.lang.Runnable runnable) {
    new java.lang.Thread(runnable).start();
}