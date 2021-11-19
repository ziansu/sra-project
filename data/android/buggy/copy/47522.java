@java.lang.SafeVarargs
public final com.badlogic.ashley.core.Family.Builder exclude(java.lang.Class<? extends com.badlogic.ashley.core.Component>... componentTypes) {
    com.badlogic.gdx.utils.Bits bits = com.badlogic.ashley.core.ComponentType.getBitsFor(componentTypes);
    bits.or(exclude);
    exclude = bits;
    return this;
}