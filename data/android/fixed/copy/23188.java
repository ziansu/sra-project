@java.lang.Override
public void getData(java.lang.String dataHandler, com.jukta.jtahoe.Attrs attrs, com.jukta.jtahoe.Block.Callback callback) {
    try {
        loadData(dataHandler, attrs);
    } catch (java.lang.Exception e) {
    }
    callback.call();
}