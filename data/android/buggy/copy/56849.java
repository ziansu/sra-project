private void outProResult(com.seekersoftvendingapp.util.TakeOutError takeOutError) {
    if (takeOutError.isSuccess()) {
        cmdBufferStoreSerial("");
    }else {
        handleResult(new com.seekersoftvendingapp.util.TakeOutError(com.seekersoftvendingapp.util.TakeOutError.HAS_NOPOWER_FLAG));
    }
}