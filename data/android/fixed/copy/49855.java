public static boolean checkExist(java.lang.String danmakuID) {
    java.io.File file = new java.io.File(((main.util.PersistenceUtil.PARSE_FILE_PATH) + danmakuID));
    return file.exists();
}