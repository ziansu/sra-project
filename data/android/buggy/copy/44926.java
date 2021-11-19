protected void finalize() {
    com.microsoft.z3.Native.delConstructor(getContext().nCtx(), getNativeObject());
}