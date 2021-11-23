@java.lang.Override
public void putInPage(java.lang.Object o, ru.spbau.mit.memory.page.RecordPage recordPage) {
    recordPage.getByteBuffer().putDouble(((double) ((int) (o))));
}