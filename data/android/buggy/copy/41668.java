public static boolean SUCCEEDED(int hr) {
    if (hr == (com.sun.jna.platform.win32.COM.COMUtils.S_OK))
        return true;
    else
        return false;
    
}