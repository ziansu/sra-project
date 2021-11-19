private void register(java.nio.file.Path dir) throws java.io.IOException {
    java.lang.System.out.format("Registering %s\n", dir);
    java.nio.file.WatchKey key = dir.register(watcher, java.nio.file.StandardWatchEventKinds.ENTRY_CREATE, java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY);
    keys.put(key, dir);
}