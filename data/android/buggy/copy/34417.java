public static synchronized void removeMethod(java.util.function.LongConsumer consumer) {
    Main.Ticker.managedMethods.remove(consumer);
}