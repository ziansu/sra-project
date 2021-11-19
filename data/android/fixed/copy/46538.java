public static void delete(com.v2soft.styxlib.library.StyxClientManager manager, java.lang.String fileName, boolean recurse) throws com.v2soft.styxlib.library.exceptions.StyxException, java.io.IOException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
    final com.v2soft.styxlib.library.StyxFile file = new com.v2soft.styxlib.library.StyxFile(manager, fileName);
    file.delete(recurse);
}