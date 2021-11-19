public static com.muxter.SingletonPattern.Singleton getInstance() {
    if ((com.muxter.SingletonPattern.Singleton.instance) == null) {
        synchronized(com.muxter.SingletonPattern.Singleton.class) {
            if ((com.muxter.SingletonPattern.Singleton.instance) == null) {
                com.muxter.SingletonPattern.Singleton.instance = new com.muxter.SingletonPattern.Singleton();
            }
        }
    }
}