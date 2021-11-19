private void send() {
    messagePackage = new a_zen.sharetoserver.MessagePackage(buildUrl(), sharedMessage);
    new a_zen.sharetoserver.helper.AsyncHTTPService(this).execute(messagePackage);
    finish();
}