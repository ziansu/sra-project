@java.lang.Override
public java.lang.Object visitClass(java.lang.Class _class) {
    if ((_class.getOwner()) instanceof java.lang.Package) {
        eu.modelwriter.core.alloyinecore.typechecking.JavaSourceFromString javaSource = javaSourceGenerator.generateInterface(_class);
    }
    return super.visitClass(_class);
}