@java.lang.Override
public com.mcintyret.jvm.core.nativeimpls.NativeReturn execute(com.mcintyret.jvm.core.exec.Variables args, com.mcintyret.jvm.core.exec.OperationContext ctx) {
    com.mcintyret.jvm.core.nativeimpls.UnsafeNatives.THE_UNSAFE.park(args.getBoolean(1), args.getLong(2));
    com.mcintyret.jvm.core.Heap.threadSleeping();
    return com.mcintyret.jvm.core.nativeimpls.NativeReturn.forVoid();
}