@java.lang.Override
public <T> void register(org.eclipse.scanning.api.IScannable<T> scannable) {
    if ((scannables) == null)
        scannables = new java.util.HashMap<>();
    
    scannables.put(scannable.getName(), scannable);
}