@java.lang.Override
public void getData(java.lang.String dataHandler, com.jukta.jtahoe.Attrs attrs, com.jukta.jtahoe.Block.Callback callback) {
    com.jukta.jtahoe.Attrs a = new com.jukta.jtahoe.Attrs();
    try {
        loadData(dataHandler, a);
    } catch (java.lang.Exception e) {
    }
    callback.call();
}