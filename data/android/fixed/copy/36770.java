public boolean isDeletable() {
    return (((null != (getParent())) && (null != (input))) && (input.isDeletable())) && (!(isVirtualSubGroup()));
}