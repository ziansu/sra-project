@java.lang.Override
public com.jetbrains.jetpad.vclang.error.doc.LineDoc getHeaderDoc(com.jetbrains.jetpad.vclang.term.SourceInfoProvider src) {
    return hList(super.getHeaderDoc(src), text(((" Cannot solve equation " + (variable)) + " <= constant")));
}