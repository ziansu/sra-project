@java.lang.Override
public void consume(org.teavm.jso.plugin.DependencyAgentType type) {
    achieveFunctorMethods(agent, type.getName(), method);
}