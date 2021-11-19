@java.lang.Override
public java.lang.Object visitClass(java.lang.Class _class) {
    if ((_class.getOwner()) instanceof java.lang.Package) {
        javaSourceGenerator.generateInterface(_class);
    }
    return super.visitClass(_class);
}