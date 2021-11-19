@java.lang.Override
public void fireChannelUnexpectedlyClosed() {
    this.wrappedSmppSessionHandler.fireChannelUnexpectedlyClosed();
    this.esme.getSmppSession().close();
    scheduleConnect(this.esme);
}