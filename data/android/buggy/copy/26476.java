@java.lang.Override
public boolean matches(org.springframework.boot.loader.archive.Archive.Entry entry) {
    if (entry.isDirectory()) {
        return entry.getName().startsWith(JarLauncher.BOOT_INF_CLASSES);
    }
    return entry.getName().startsWith(JarLauncher.BOOT_INF_LIB);
}