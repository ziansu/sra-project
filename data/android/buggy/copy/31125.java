@com.oracle.truffle.api.dsl.Specialization(limit = "INLINE_CACHE_SIZE", guards = { "contextLevel != 0" , "receiver.getSOMClass() == rcvrClass" })
public final java.lang.Object doForFurtherOuter(final som.vmobjects.SObjectWithClass receiver, @com.oracle.truffle.api.dsl.Cached(value = "receiver.getSOMClass()")
final som.vmobjects.SClass rcvrClass, @com.oracle.truffle.api.dsl.Cached(value = "getEnclosingClass(receiver)")
final som.vmobjects.SClass lexicalClass) {
    return getEnclosingObject(receiver, lexicalClass);
}