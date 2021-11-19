@java.lang.Override
public void next() {
    util.DroolsManager.getInstance().insert(new util.Message(id, this.getClass(), util.Message.TYPE_PROCESSING_END, java.lang.System.nanoTime()));
}