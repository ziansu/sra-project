@java.lang.Override
public void onEndOf() {
    connector.getEbus().removeAll();
    channelsFuture.setResult(s);
}