@java.lang.Override
public java.lang.Object visitEnum(java.lang.Enum _enum) {
    if ((_enum.getOwner()) instanceof java.lang.Package) {
        javaSourceGenerator.generateEnum(_enum);
    }
    return null;
}