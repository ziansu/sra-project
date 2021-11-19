private void postProcessItemInsert(@javax.annotation.Nonnull
illarion.client.graphics.Item newItem) {
    if (orderNotSet) {
        setOrder(newItem.getOrder());
        show();
    }
    rectangleDirty = true;
    newItem.show(this);
}