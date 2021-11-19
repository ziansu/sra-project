public static boolean FAILED(int hr) {
    return hr != (com.sun.jna.platform.win32.COM.COMUtils.S_OK);
}