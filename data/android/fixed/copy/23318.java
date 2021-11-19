public void onClick(android.content.DialogInterface dialog, int id) {
    if (watchdog) {
        com.hijacker.MainActivity.watchdog_thread = new java.lang.Thread(com.hijacker.MainActivity.watchdog_runnable);
        com.hijacker.MainActivity.watchdog_thread.start();
    }
}