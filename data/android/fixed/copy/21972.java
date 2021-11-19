private void checkFileSize(long size) throws com.scrumiverse.exception.InvaldFileSizeException {
    long sizeInMb = size / 1000000L;
    java.lang.System.out.println(("SIZE IN MB: " + sizeInMb));
    if (sizeInMb > (com.scrumiverse.web.MetaController.MAX_SIZE_MB)) {
        throw new com.scrumiverse.exception.InvaldFileSizeException();
    }
}