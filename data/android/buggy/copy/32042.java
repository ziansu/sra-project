@java.lang.Override
public boolean apply(com.oracle.graal.nodes.graphbuilderconf.GraphBuilderContext b, jdk.vm.ci.meta.ResolvedJavaMethod targetMethod, com.oracle.graal.nodes.graphbuilderconf.InvocationPlugin.Receiver receiver, com.oracle.graal.nodes.ValueNode value) {
    b.push(JavaKind.Int, b.recursiveAppend(new com.oracle.graal.nodes.calc.ReinterpretNode(jdk.vm.ci.meta.JavaKind.Int, value).canonical(null, value)));
    return true;
}