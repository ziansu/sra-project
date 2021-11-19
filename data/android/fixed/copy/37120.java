@java.lang.Override
public boolean hasReference(@org.jetbrains.annotations.NotNull
java.lang.String objectReference) {
    return ((objectAttributes.size()) == 1) || (objectAttributes.containsKey(objectReference));
}