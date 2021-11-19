public void watchDirectory(java.lang.String path, java.lang.Boolean watchForNewFiles, java.lang.String virtualRoot) {
    java.lang.System.out.println(("watchDirectory(): " + path));
    new java.lang.Thread(new studyproject.API.Core.File.Watcher.FileWatcher(path, watchForNewFiles, this, virtualRoot)).start();
}