@java.lang.Override
public <T> void register(org.eclipse.scanning.api.IScannable<T> scannable) {
    scannables.put(scannable.getName(), scannable);
}