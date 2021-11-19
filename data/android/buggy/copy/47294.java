@java.lang.Override
public io.realm.internal.LinkView getLinkList(long columnIndex) {
    long nativeLinkViewPtr = io.realm.internal.UncheckedRow.nativeGetLinkView(nativePointer, columnIndex);
    return new io.realm.internal.LinkView(context, parent, columnIndex, nativeLinkViewPtr);
}