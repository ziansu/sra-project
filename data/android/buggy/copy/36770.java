public boolean isDeletable() {
    return ((null != (getParent())) && (input.isDeletable())) && (!(isVirtualSubGroup()));
}