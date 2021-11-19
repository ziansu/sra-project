public void free() {
    com.oracle.truffle.api.CompilerAsserts.neverPartOfCompilation();
    if (isFreed) {
        throw new java.lang.AssertionError("already freed");
    }
    com.oracle.truffle.llvm.runtime.memory.LLVMStack.UNSAFE.freeMemory(lowerBounds);
    lowerBounds = 0;
    upperBounds = 0;
    stackPointer = 0;
    isFreed = true;
}