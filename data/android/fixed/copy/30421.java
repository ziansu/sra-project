public net.github.rtc.app.utils.message.MessageBuilder setSendingDate(java.util.Date sendingDate) {
    if (sendingDate == null) {
        throw new java.lang.IllegalArgumentException();
    }
    this.sendingDate = new java.util.Date(sendingDate.getTime());
    return this;
}