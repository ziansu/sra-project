private void outProResult(com.seekersoftvendingapp.util.TakeOutError takeOutError) {
    if (takeOutError.isSuccess()) {
        cmdBufferVendingSerial("");
    }else {
        et_getcard.setText("");
        handleResult(new com.seekersoftvendingapp.util.TakeOutError(com.seekersoftvendingapp.util.TakeOutError.HAS_NOPOWER_FLAG));
    }
}