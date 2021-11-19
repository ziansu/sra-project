public static org.jf.dexlib2.dexbacked.util.DebugInfo newOrEmpty(@javax.annotation.Nonnull
org.jf.dexlib2.dexbacked.DexBackedDexFile dexFile, int debugInfoOffset, @javax.annotation.Nonnull
org.jf.dexlib2.dexbacked.DexBackedMethodImplementation methodImpl) {
    if ((debugInfoOffset == 0) || (debugInfoOffset == (-1))) {
        return org.jf.dexlib2.dexbacked.util.DebugInfo.EmptyDebugInfo.INSTANCE;
    }
    return new org.jf.dexlib2.dexbacked.util.DebugInfo.DebugInfoImpl(dexFile, debugInfoOffset, methodImpl);
}