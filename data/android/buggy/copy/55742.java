public static void quit() {
    ClientReceiverThread.terminate();
    ClientListenerThread.terminate();
    java.lang.System.exit(0);
}