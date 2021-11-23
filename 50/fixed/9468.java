public static com.runningforlife.jason.SingletonExamples.LazySingletonSafe getInstance() {
    if ((com.runningforlife.jason.SingletonExamples.LazySingletonSafe.sInstance) == null) {
        synchronized(com.runningforlife.jason.SingletonExamples.LazySingletonSafe.class) {
            if ((com.runningforlife.jason.SingletonExamples.LazySingletonSafe.sInstance) == null) {
                com.runningforlife.jason.SingletonExamples.LazySingletonSafe.sInstance = new com.runningforlife.jason.SingletonExamples.LazySingletonSafe();
            }
        }
    }
    return com.runningforlife.jason.SingletonExamples.LazySingletonSafe.sInstance;
}