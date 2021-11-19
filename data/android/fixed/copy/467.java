public void enumerateChildren(java.util.function.Consumer<sirius.biz.storage.vfs.VirtualFile> consumer) {
    if ((childProvider) != null) {
        childProvider.accept(this, consumer);
    }
}