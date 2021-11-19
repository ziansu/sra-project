@java.lang.Override
public void visitEnd() {
    assert (superInterfaces) != null;
    for (java.lang.String superInterface : superInterfaces) {
        new mockit.internal.classGeneration.BaseImplementationGenerator.MethodGeneratorForImplementedSuperInterface(superInterface);
    }
}