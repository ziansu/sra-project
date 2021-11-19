public static com.xiaomi.jinping.MemoryStore getInstance() {
    if ((com.xiaomi.jinping.MemoryStore.instance) == null) {
        synchronized(com.xiaomi.jinping.MemoryStore.class) {
            if ((com.xiaomi.jinping.MemoryStore.instance) == null) {
                com.xiaomi.jinping.MemoryStore.instance = new com.xiaomi.jinping.MemoryStore(com.xiaomi.jinping.MemoryStore.host, com.xiaomi.jinping.MemoryStore.port);
            }
        }
    }
    return com.xiaomi.jinping.MemoryStore.instance;
}