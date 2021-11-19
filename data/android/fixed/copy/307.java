@java.lang.Override
protected void onConnect() {
    ebus.addEvent(new it.biffi.jirc.bot.event.ConnectionEvent());
}