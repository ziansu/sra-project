@java.lang.Override
protected void readNdefMessage(org.ndeftools.Message message) {
    if ((message.size()) > 1) {
        toast(getString(org.ndeftools.boilerplate.R.string.readMultipleRecordNDEFMessage));
    }else {
        toast(getString(org.ndeftools.boilerplate.R.string.readSingleRecordNDEFMessage));
    }
}