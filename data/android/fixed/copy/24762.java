private org.harctoolbox.harchardware.ir.GlobalCache.GlobalCacheIrTransmitter newGlobalCacheIrTransmitter(org.harctoolbox.harchardware.ir.Transmitter trans) {
    org.harctoolbox.harchardware.ir.GlobalCache.GlobalCacheIrTransmitter tr = (trans == null) ? new org.harctoolbox.harchardware.ir.GlobalCache.GlobalCacheIrTransmitter() : ((org.harctoolbox.harchardware.ir.GlobalCache.GlobalCacheIrTransmitter) (trans));
    tr.normalize(firstIrModule);
    return tr;
}