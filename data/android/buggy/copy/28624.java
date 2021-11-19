private org.codehaus.groovy.ast.ClassNode configureSourceType(org.eclipse.jdt.internal.compiler.lookup.SourceTypeBinding type) {
    org.codehaus.jdt.groovy.internal.compiler.ast.JDTClassNode jcn = new org.codehaus.jdt.groovy.internal.compiler.ast.JDTClassNode(type, resolver);
    return jcn;
}