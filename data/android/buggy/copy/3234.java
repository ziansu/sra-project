public static void close() {
    java.lang.System.out.println("Delete local file system");
    net.serenitybdd.core.photography.DarkroomFileSystem.fileSystemThreadLocal.remove();
}