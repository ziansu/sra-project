private void disconnectAbnormally(java.lang.String message) {
    halt();
    errorStack.push(new com.google.sitebricks.mail.MailClientHandler.Error(completions.poll(), message, wireTrace.list()));
    idler.disconnect();
}