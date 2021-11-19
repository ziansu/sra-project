@java.lang.Override
public java.lang.Object visitInterface(eu.modelwriter.core.alloyinecore.typechecking.Interface _interface) {
    if ((_interface.getOwner()) instanceof java.lang.Package) {
        javaSourceGenerator.generateInterface(_interface);
    }
    return super.visitInterface(_interface);
}