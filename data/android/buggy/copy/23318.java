public void onClick(android.content.DialogInterface dialog, int id) {
    if ((!(com.hijacker.MainActivity.watchdog_thread.isAlive())) && (watchdog)) {
        com.hijacker.MainActivity.watchdog_thread = new java.lang.Thread(com.hijacker.MainActivity.watchdog_runnable);
        com.hijacker.MainActivity.watchdog_thread.start();
    }
}