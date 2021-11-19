@java.lang.Override
public void insert(long startFrom, org.exbin.utils.binary_data.BinaryData insertedData) {
    long length = insertedData.getDataSize();
    insertUninitialized(startFrom, length);
    replace(startFrom, insertedData, 0, length);
}