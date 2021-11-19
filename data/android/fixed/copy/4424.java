@java.lang.Override
public com.google.common.util.concurrent.ListenableFuture<se.tre.freki.meta.LabelMeta> apply(final java.lang.String name) throws java.lang.Exception {
    return store.getMeta(id, type);
}