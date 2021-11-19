@java.lang.Override
public org.eclipse.smarthome.core.library.types.StringType getProcessPath(int pid) throws org.openhab.binding.systeminfo.model.DeviceNotFoundException {
    oshi.software.os.OSProcess process = operatingSystem.getProcess(pid);
    java.lang.String path = process.getPath();
    return new org.eclipse.smarthome.core.library.types.StringType(path);
}