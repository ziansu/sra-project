@java.lang.Override
public java.util.Collection<org.tvl.goworks.editor.go.codemodel.impl.FieldModelImpl> getFields() {
    if ((getElementType().getKind()) == (org.tvl.goworks.editor.go.codemodel.TypeKind.INTRINSIC)) {
        return java.util.Collections.emptyList();
    }
    return getElementType().getFields();
}