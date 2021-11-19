@com.oracle.truffle.api.dsl.Specialization(guards = { "contextLevel != 0" }, contains = "fixedLookup")
public final java.lang.Object fallback(final som.vmobjects.SObjectWithClass receiver) {
    return getEnclosingObject(receiver, getEnclosingClass(receiver));
}