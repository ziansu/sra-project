@java.lang.Override
public void onReadUnready() {
    _history.add("unready");
    super.onReadUnready();
}