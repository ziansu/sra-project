@java.lang.Override
public void accept(java.lang.Long id) {
    m.setId(id);
    heritage.getMedia().add(m);
    updateAdapter();
}