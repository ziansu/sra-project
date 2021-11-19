@java.lang.Override
public ClassFileLocator.Resolution locate(java.lang.String typeName) throws java.io.IOException {
    return this.typeName.equals(typeName) ? new net.bytebuddy.dynamic.ClassFileLocator.Resolution.Explicit(binaryRepresentation) : classFileLocator.locate(typeName);
}