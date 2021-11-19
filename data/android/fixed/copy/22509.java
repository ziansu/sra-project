public com.blackbuild.groovy.configdsl.transform.ast.MethodBuilder inheritDeprecationFrom(com.blackbuild.groovy.configdsl.transform.ast.FieldNode fieldNode) {
    if (!(fieldNode.getAnnotations(com.blackbuild.groovy.configdsl.transform.ast.MethodBuilder.DEPRECATED_NODE).isEmpty())) {
        deprecated = true;
    }
    return this;
}