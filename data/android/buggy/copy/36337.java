@java.lang.Override
public void delete(int vmId) {
    properties.remove(vmId);
    saveToFile();
}