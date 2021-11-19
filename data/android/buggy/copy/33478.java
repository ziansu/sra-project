public static void add(java.lang.Process process) {
    if ((Disk.disk.size()) <= (Disk.MAXSIZE)) {
        Disk.disk.add(process);
    }
}