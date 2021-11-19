public static void processNewFiles(final java.nio.file.Path inputDir, final java.nio.file.Path outputDir) {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            ru.nekki.test.FileSystemUtil.waitForNewFilesAndProcess(inputDir, outputDir);
        }
    }).start();
}