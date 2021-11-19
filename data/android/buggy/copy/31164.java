@java.lang.Override
public java.util.Set<compiler.firm.backend.storage.RegisterBased> getReadRegisters() {
    return compiler.utils.Utils.unionSet(source1, source2);
}