@java.lang.SafeVarargs
public com.badlogic.ashley.core.Family.Builder exclude(java.lang.Class<? extends com.badlogic.ashley.core.Component>... componentTypes) {
    exclude = com.badlogic.ashley.core.ComponentType.getBitsFor(componentTypes);
    return this;
}