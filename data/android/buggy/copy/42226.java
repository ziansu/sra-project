public static boolean isExit() {
    java.io.File files = new java.io.File("/sdcard/wltlib");
    if (!(files.exists())) {
        return true;
    }else
        return false;
    
}