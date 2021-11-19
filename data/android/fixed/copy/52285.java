public static boolean isRootAvailable() {
    return (com.stericson.RootShell.RootShell.findBinary("su", true).size()) > 0;
}