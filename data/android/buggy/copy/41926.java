@java.lang.SuppressWarnings(value = "unused")
public static java.lang.invoke.MethodHandle invokeInlinedCall(java.lang.invoke.MethodHandles.Lookup lookup, java.lang.invoke.MethodType type, java.lang.String methodName, java.lang.Object front) throws java.lang.Throwable {
    return lookup.findStatic(rt.RT.getBack__(lookup, front).getClass(), methodName, type).bindTo(front);
}