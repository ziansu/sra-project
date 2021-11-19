@java.lang.Override
public boolean hasAttribute(@org.jetbrains.annotations.NotNull
java.lang.String objectReference, @org.jetbrains.annotations.NotNull
java.lang.String attribute) {
    return (hasReference(objectReference)) && (objectAttributes.get(objectReference).contains(attribute));
}